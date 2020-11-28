package com.yoyling;

import com.yoyling.domain.User;
import com.yoyling.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class AppTest {
    @Test
    public void test() throws IOException {

        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        SqlSession session = factory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.selectByPrimaryKey(26);

        System.out.println(user.getPassword());

    }
}
