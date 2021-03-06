package com.powernode.dao;

import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStu(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent", student);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
