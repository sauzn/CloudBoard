package com.sauzn.cloudboard.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    // id
    private Integer id;

    // 登录账号
    private String loginAccount;

    // 登录密码
    private String passWord;

    // 用户名称
    private String userName;

    // 手机号
    private String phoneNumber;

    // 头像
    private String avatar;

    // 性别
    private Integer gender;

    // 生日
    private String birthday;

    // 地区
    private String area;

    // 创建时间
    private String createTime;

    // 更新时间
    private String updateTime;

    // 创建人
    private String createBy;

    // 更新人
    private String updateBy;

}
