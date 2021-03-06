package com.powernode.dao;

import com.powernode.po.Student;

import java.util.List;

public interface IStudentDao {

    List<Student> selectStudentsByCondition(String name, int age);

}
