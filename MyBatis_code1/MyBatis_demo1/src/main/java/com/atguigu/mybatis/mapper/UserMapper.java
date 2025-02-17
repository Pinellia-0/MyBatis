package com.atguigu.mybatis.mapper;

/**
 * Data:2025/2/23
 *
 */
public interface UserMapper {
    /**
     * MyBatis:面向接口编程的两个一致
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中的SQL语句的id要和Mapper接口中的方法名一致
     *
     * 表--实体类--mapper接口--映射文件
     */
    int insertUser();
}
