package com.powernode.test;

import com.powernode.dao.INewsLabelDao;
import com.powernode.po.NewsLabel;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        List<NewsLabel> children = dao.selectChildrenByParent(2);
        children.forEach(System.out::println);
    }

}
