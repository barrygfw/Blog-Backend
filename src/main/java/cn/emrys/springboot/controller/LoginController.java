package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.entity.User;
import cn.emrys.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param user
     * @param bindingResult
     * @return
     */
    @RequestMapping("/login")
    @PostMapping
    public Response login(@RequestBody @Valid User user, BindingResult bindingResult)
    {
        String msg = "";
        if (bindingResult.hasErrors()) {
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : objectErrors) {
                msg += objectError.getDefaultMessage();
            }
            return new Response(500, msg);
        }
        String user_name = user.getUser_name();
        User temp_user = userService.findByName(user_name);
        if (temp_user != null) {
            if (!temp_user.getPassword().equals(user.getPassword())) return new Response(500, "密码错误!");
            //处理session
            int login_times = temp_user.getLogin_times();
            login_times++;
            temp_user.setLogin_times(login_times);
            userService.update(temp_user);
            return new Response(200, "登录成功!", temp_user);
        }
        return new Response(500, "登录失败,用户不存在");
    }

    /**
     * 用户注册
     * @param user
     * @param bindingResult
     * @return
     */
    @RequestMapping("/regist")
    @PostMapping
    public Response regist(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors() || user.getEmail() == null) return new Response(500, "请检查输入!");
        if (userService.findByName(user.getUser_name()) != null) return new Response(500, "注册失败,用户已存在!");
        try{
            userService.create(user);
        }catch(Exception e){
            return new Response(500, "发生错误:" + e.getMessage());
        }
        return new Response(200, "注册成功!");
    }
}
