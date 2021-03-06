package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void test() {
        Student stu = new Student("田七", 27, 95);

        Map<String, Object> map = new HashMap<>();
        map.put("nameCon", "张");
        map.put("ageCon", 23);
        map.put("stu", stu);

        List<Student> students = dao.selectStudentsByMap(map);
        students.forEach(System.out::println);
    }

}
