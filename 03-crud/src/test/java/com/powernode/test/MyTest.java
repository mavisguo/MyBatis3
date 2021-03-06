package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.dao.StudentDaoImpl;
import com.powernode.po.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class MyTest {

    private IStudentDao dao;

    @BeforeAll
    public void before() {
        dao = new StudentDaoImpl();
    }

    @Test
    public void test01() {
        Student student = new Student("张三", 23, 93.5);
        System.out.println("插入前: student = " + student);
        dao.insertStudent(student);
        System.out.println("插入后: student = " + student);
    }

    @Test
    public void test02() {
        Student student = new Student("张三", 23, 93.5);
        System.out.println("插入前: student = " + student);
        dao.insertStudentCacheId(student);
        System.out.println("插入后: student = " + student);
    }

    @Test
    public void test03() {
        dao.deleteStudentById(1);
    }

    @Test
    public void test04() {
        Student student = new Student("赵六", 26, 96.5);
        student.setId(2);
        dao.updateStudent(student);
    }

    @Test
    public void test05() {
        List<Student> students = dao.selectAllStudents();
        students.forEach(System.out::println);
    }

    @Test
    public void test06() {
        Map<String, Object> map = dao.selectAllStudentsMap();
        map.keySet().forEach(System.out::println);
    }

    @Test
    public void test07() {
        Student student = dao.selectStudentById(1);
        System.out.println(student);
    }

    @Test
    public void test08() {
        List<Student> students = dao.selectStudentsByName("张");
        students.forEach(System.out::println);
    }

}
