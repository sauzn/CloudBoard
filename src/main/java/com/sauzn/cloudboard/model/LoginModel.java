package com.sauzn.cloudboard.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.DigestUtils;

@Getter
@Setter
@ToString
public class LoginModel {
    public String loginAccount;
    public String passWord;

    public void setPassWord(String passWord) {
        // 密码加密
        this.passWord = DigestUtils.md5DigestAsHex(passWord.getBytes());
    }
}
