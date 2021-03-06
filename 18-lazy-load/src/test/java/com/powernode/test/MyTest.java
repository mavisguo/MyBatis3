package com.powernode.test;

import com.powernode.dao.ICountryDao;
import com.powernode.po.Country;
import com.powernode.po.Minister;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class MyTest {

    private ICountryDao dao;
    private SqlSession sqlSession;

    @BeforeAll
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(ICountryDao.class);
    }

    @AfterAll
    public void After() {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }

    @Test
    public void test() {
        Country country = dao.selectCountryById(1);
        System.out.println(country.getCname());
        Set<Minister> ministers = country.getMinisters();
        System.out.println(ministers.size());
    }

}
