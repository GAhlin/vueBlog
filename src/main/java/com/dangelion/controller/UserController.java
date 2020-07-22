package com.dangelion.controller;


import com.dangelion.common.lang.Result;
import com.dangelion.entity.User;
import com.dangelion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Gavin
 * @since 2020-07-22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.success(user);
    }
}
