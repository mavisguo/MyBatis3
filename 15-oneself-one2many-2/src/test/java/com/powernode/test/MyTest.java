package com.powernode.test;

import com.powernode.dao.INewsLabelDao;
import com.powernode.po.NewsLabel;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTest {

    private INewsLabelDao dao;
    private SqlSession sqlSession;

    @BeforeAll
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(INewsLabelDao.class);
    }

    @AfterAll
    public void After() {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }

    @Test
    public void test() {
        NewsLabel newsLabel = dao.selectNewsLabelById(2);
        System.out.println(newsLabel);
    }

}
