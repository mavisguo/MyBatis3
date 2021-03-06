package com.powernode.test;

import com.powernode.dao.IMinisterDao;
import com.powernode.po.Minister;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTest {

    private IMinisterDao dao;
    private SqlSession sqlSession;

    @BeforeAll
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IMinisterDao.class);
    }

    @AfterAll
    public void After() {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }

    @Test
    public void test() {
        Minister minister = dao.selectMinisterById(2);
        System.out.println(minister);
    }

}
