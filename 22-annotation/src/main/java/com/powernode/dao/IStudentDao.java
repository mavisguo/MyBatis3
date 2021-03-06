package com.powernode.dao;

import com.powernode.po.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentDao {

    @Insert(value = {"insert into student (name, age, score) values (#{name}, #{age}, #{score})"})
    void insertStudent(Student student);

    @Insert(value = "insert into student (name, age, score) values (#{name}, #{age}, #{score})")
    @SelectKey(statement = "select @@identity", resultType = Integer.class, keyProperty = "id", before = false)
    void insertStudentCacheId(Student student);

    @Delete("delete from student where id = #{id}")
    void deleteStudentById(int id);

    @Update("update student set name = #{name}, age = #{age}, score = #{score} where id = #{id}")
    void updateStudent(Student student);

    @Select("select id, name, age, score from student")
    List<Student> selectAllStudents();

    @Select("select id, name, age, score from student where id = #{id}")
    Student selectStudentById(int id);

    @Select("select id, name, age, score from student where name like '%' #{name} '%'")
    List<Student> selectStudentsByName(String name);

}
