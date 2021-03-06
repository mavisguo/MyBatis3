package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.dao.StudentDaoImpl;
import com.powernode.po.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTest {

    private IStudentDao dao;

    @BeforeAll
    public void before() {
        dao = new StudentDaoImpl();
    }

    @Test
    public void testInsert() {
        Student student = new Student("张三", 23, 93.5);
        dao.insertStu(student);
    }

}
