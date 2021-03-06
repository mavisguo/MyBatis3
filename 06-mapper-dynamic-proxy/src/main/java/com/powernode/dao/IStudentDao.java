package com.powernode.dao;

import com.powernode.po.Student;

import java.util.List;

public interface IStudentDao {

    void insertStudent(Student student);

    void insertStudentCacheId(Student student);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    Student selectStudentById(int id);

    List<Student> selectStudentsByName(String name);

}
