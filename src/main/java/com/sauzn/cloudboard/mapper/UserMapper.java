package com.sauzn.cloudboard.mapper;


import com.sauzn.cloudboard.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    User Sel(@Param("id")int id);

}
