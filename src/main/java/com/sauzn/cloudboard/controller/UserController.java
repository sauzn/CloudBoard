package com.sauzn.cloudboard.controller;

import com.sauzn.cloudboard.model.LoginModel;
import com.sauzn.cloudboard.service.UserService;
import com.sauzn.cloudboard.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户")
@ResponseBody
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * 返回token
     */
    @PostMapping(value = "/login")
    @ApiOperation(value = "用户登录")
    public String login(LoginModel loginModel){
        return userService.login(loginModel);
    }

    /**
     * 重置密码
     */
    @PostMapping(value = "/restPassWord")
    @ApiOperation(value = "重置密码")
    public void restPassWord(LoginModel loginModel){

    }

    /**
     * 注册
     */
    @PostMapping(value = "/register")
    @ApiOperation(value = "重置密码")
    public void register(LoginModel loginModel){

    }
}
