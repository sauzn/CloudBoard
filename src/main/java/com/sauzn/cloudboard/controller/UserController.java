package com.sauzn.cloudboard.controller;

import com.sauzn.cloudboard.service.UserService;
import com.sauzn.cloudboard.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "desc of class")
@RequestMapping("/testBoot")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("getUser/{id}")
    @ApiOperation(value = "desc of method", notes = "")
//    @CacheEvict(value="thisredis", key="'users_'+#id",condition="#id!=1")
    public String GetUser(@PathVariable int id){
//        redisUtil.lSet("abc","abc");
        boolean a = redisUtil.set("abc","abc2");
        log.info("abc2:" + a);
        String abc = String.valueOf(redisUtil.get("abc"));

        log.info("abc:" + abc);
        return userService.Sel(id).toString();
    }
}
