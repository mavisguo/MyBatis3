package com.powernode.dao;

import com.powernode.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStu(Student student) {
        try {
            //1.加载主配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            //2.创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            //4.相关操作
            sqlSession.insert("insertStudent", student);
            //5.事务提交
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
