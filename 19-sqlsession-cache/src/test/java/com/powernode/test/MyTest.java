package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTest {

    private IStudentDao dao;
    private SqlSession sqlSession;

    @BeforeAll
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
    }

    @AfterAll
    public void After() {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }

    /**
     * 证明一级缓存是存在的
     */
    @Test
    public void test01() {
        Student student = dao.selectStudentsById(1);
        System.out.println(student);

        Student student2 = dao.selectStudentsById(1);
        System.out.println(student2);
    }

    /**
     * 缓存的底层实现是一个Map，Map的value即查询结果，Map的key即查询依据；使用的ORM框架不同，查询依据是不同的。
     * 证明从一级缓存中读取数据的依据：
     * MyBatis的一级缓存查询依据是：SQL的id + SQL语句；
     * Hibernate的一级缓存的查询依据是：查询结果对象的id。
     */
    @Test
    public void test02() {
        Student student = dao.selectStudentsById(1);
        System.out.println(student);

        Student student2 = dao.selectStudentsById2(1);
        System.out.println(student2);
    }

    @Test
    public void test03() {
        Student student = dao.selectStudentsById(1);
        System.out.println(student);

        //增删改操作都会清空一级缓存，无论是否提交
        dao.insertStudent(new Student("赵六", 26, 96.5));

        Student student2 = dao.selectStudentsById(1);
        System.out.println(student2);
    }

}
