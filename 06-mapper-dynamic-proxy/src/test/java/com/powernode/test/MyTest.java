package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        Student student = new Student("张三", 23, 93.5);
        System.out.println("插入前: student = " + student);
        dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("插入后: student = " + student);
    }

    @Test
    public void test02() {
        Student student = new Student("张三", 23, 93.5);
        System.out.println("插入前: student = " + student);
        dao.insertStudentCacheId(student);
        sqlSession.commit();
        System.out.println("插入后: student = " + student);
    }

    @Test
    public void test03() {
        dao.deleteStudentById(1);
        sqlSession.commit();
    }

    @Test
    public void test04() {
        Student student = new Student("赵六", 26, 96.5);
        student.setId(2);
        dao.updateStudent(student);
        sqlSession.commit();
    }

    @Test
    public void test05() {
        List<Student> students = dao.selectAllStudents();
        students.forEach(System.out::println);
    }

    @Test
    public void test06() {
        Student student = dao.selectStudentById(1);
        System.out.println(student);
    }

    @Test
    public void test07() {
        List<Student> students = dao.selectStudentsByName("张");
        students.forEach(System.out::println);
    }

}
