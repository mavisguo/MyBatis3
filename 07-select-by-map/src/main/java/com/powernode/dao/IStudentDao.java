package com.powernode.dao;

import com.powernode.po.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {

    List<Student> selectStudentsByMap(Map<String, Object> map);

}
