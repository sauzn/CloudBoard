package com.sauzn.cloudboard.service.impl;


import com.sauzn.cloudboard.common.CommonDao;
import com.sauzn.cloudboard.entity.User;
import com.sauzn.cloudboard.mapper.UserMapper;
import com.sauzn.cloudboard.model.LoginModel;
import com.sauzn.cloudboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public String login(LoginModel loginModel) {
        User user = userMapper.getUserInfoByLoginAccount(loginModel.getLoginAccount());
        boolean bool = loginModel.getPassWord().equals(user.getPassWord());

        return null;
    }
}
