package com.test.controller;

import com.test.pojo.Users;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/24 0024 下午 2:45
 * @Description TODO
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    //    用户添加
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        userService.addUser(users);
        return "success";
    }

    //获取user
    @ResponseBody
    @RequestMapping("/getUser/{id}")
    public Users getUser(@PathVariable(value = "id") int id) {
        Users user = userService.getUser(id);
        return user;
    }
}
