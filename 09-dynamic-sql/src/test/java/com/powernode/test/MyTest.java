package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void test01() {
//        Student student = new Student("张", 23, 0);
//        Student student = new Student("", 23, 0);
        Student student = new Student("", 0, 0);
        List<Student> students = dao.selectStudentsByIf(student);
        students.forEach(System.out::println);
    }

    @Test
    public void test02() {
//        Student student = new Student("张", 23, 0);
//        Student student = new Student("", 23, 0);
        Student student = new Student("", 0, 0);
        List<Student> students = dao.selectStudentsByWhere(student);
        students.forEach(System.out::println);
    }

    @Test
    public void test03() {
//        Student student = new Student("张", 23, 0);
//        Student student = new Student("", 23, 0);
        Student student = new Student("", 0, 0);
        List<Student> students = dao.selectStudentsByChoose(student);
        students.forEach(System.out::println);
    }

    @Test
    public void test04() {
        int[] ids = {1, 3, 4};
        List<Student> students = dao.selectStudentsByForeach(ids);
        students.forEach(System.out::println);
    }

    @Test
    public void test05() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        List<Student> students = dao.selectStudentsByForeach2(ids);
        students.forEach(System.out::println);
    }

    @Test
    public void test06() {
        Student stu1 = new Student();
        stu1.setId(1);
        Student stu2 = new Student();
        stu2.setId(3);
        List<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        List<Student> students = dao.selectStudentsByForeach3(stus);
        students.forEach(System.out::println);
    }

    @Test
    public void test07() {
        Student stu1 = new Student();
        stu1.setId(1);
        Student stu2 = new Student();
        stu2.setId(3);
        List<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        List<Student> students = dao.selectStudentsBySqlFragment(stus);
        students.forEach(System.out::println);
    }

}
