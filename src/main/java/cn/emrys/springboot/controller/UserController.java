package cn.emrys.springboot.controller;

import cn.emrys.springboot.entity.Response;
import cn.emrys.springboot.entity.User;
import cn.emrys.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("update")
    public Response update(@RequestBody @Valid User user, BindingResult bindingResult) {
        return new Response(200,"succsss");
    }
}
