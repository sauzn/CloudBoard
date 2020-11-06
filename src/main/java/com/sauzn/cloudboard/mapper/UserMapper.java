package com.sauzn.cloudboard.mapper;


import com.sauzn.cloudboard.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserInfoByLoginAccount(@Param("loginAccount")String loginAccount);

}
