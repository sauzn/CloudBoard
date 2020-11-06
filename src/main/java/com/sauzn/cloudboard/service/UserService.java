package com.sauzn.cloudboard.service;

import com.sauzn.cloudboard.model.LoginModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public String login(LoginModel loginModel);
}
