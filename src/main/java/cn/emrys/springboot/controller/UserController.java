package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.entity.User;
import cn.emrys.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 通过用户名获取用户列表
     * @param name
     * @return
     */
    @GetMapping("/searchByName")
    public List<User> searchByName(String name) {
        return userService.searchByName(name);
    }

    /**
     * 删除用户(批量)
     * @param ids
     * @return
     */
    @DeleteMapping("delete")
    public Response delete(@RequestBody int[] ids) {
        int num;
        try{
            num = userService.delete(ids);
            if (num != 0) return new Response(200, "删除 " + num + " 条数据成功");
            else throw new Exception("删除失败");
        }catch(Exception e) {
            return new Response(500, "删除失败");
        }
    }

    /**
     * 更新用户状态
     * @param data
     * @return
     */
    @PutMapping("/status")
    public Response statue(@RequestBody Map<String,Integer> data) {
        try{
            if (userService.update_status(data.get("id"), data.get("status")) != 0) {
                return new Response(200, "更新成功");
            }
            else throw new Exception("更新失败");
        }catch(Exception e) {
            return new Response(500, "更新失败");
        }
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Response update(@RequestBody User user) {
        try{
            if (userService.update(user) != 0) return new Response(200, "更新成功");
            else throw new Exception("更新失败");
        }catch(Exception e) {
            return new Response(500, "更新失败");
        }
    }
}
