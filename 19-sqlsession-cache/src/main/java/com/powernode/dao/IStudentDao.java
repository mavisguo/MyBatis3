package com.powernode.dao;

import com.powernode.po.Student;

public interface IStudentDao {

    void insertStudent(Student student);

    Student selectStudentsById(int id);

    Student selectStudentsById2(int id);

}
