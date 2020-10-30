package com.sauzn.cloudboard.service;


import com.sauzn.cloudboard.common.CommonDao;
import com.sauzn.cloudboard.entity.User;
import com.sauzn.cloudboard.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
