package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    /**
     * 根据用户名进行模糊查询用户信息
     */
    List<User> getUserByLike(@Param("username") String username);

}
