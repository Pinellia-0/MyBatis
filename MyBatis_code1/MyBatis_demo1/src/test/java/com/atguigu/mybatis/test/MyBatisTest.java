package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    /**
     * SqlSession默认不提交事务，若需要自动提交
     * 使用SqlSessionFactory.openSession(true);
     * @throws IOException
     */

    @Test
    public void testMyBatis() throws IOException {//alt+enter抛出异常
        //加载核心配置文件
        //ctrl + alt + v
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
       //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int result = userMapper.insertUser();
        //提交事务
        sqlSession.commit();
        System.out.println("result" + result);
    }
}
