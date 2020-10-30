package com.sauzn.cloudboard.controller;

import com.sauzn.cloudboard.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "desc of class")
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    @ApiOperation(value = "desc of method", notes = "")
//    @CacheEvict(value="thisredis", key="'users_'+#id",condition="#id!=1")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
}
