package com.dtytest.dty_test.controller;


import com.dtytest.dty_test.common.lang.Result;
import com.dtytest.dty_test.entity.User;
import com.dtytest.dty_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @since 2020-12-23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user =userService.getById(1L);
        return new Result(200, "操作成功", user);
    }



}
