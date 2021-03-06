package com.powernode.dao;

import com.powernode.po.Student;

import java.util.List;

public interface IStudentDao {

    List<Student> selectStudentsByIf(Student student);

    List<Student> selectStudentsByWhere(Student student);

    List<Student> selectStudentsByChoose(Student student);

    List<Student> selectStudentsByForeach(int[] ids);

    List<Student> selectStudentsByForeach2(List<Integer> ids);

    List<Student> selectStudentsByForeach3(List<Student> stus);

    List<Student> selectStudentsBySqlFragment(List<Student> stus);

}
