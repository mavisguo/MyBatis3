package com.powernode.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            if (null == sqlSessionFactory) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
            return sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
