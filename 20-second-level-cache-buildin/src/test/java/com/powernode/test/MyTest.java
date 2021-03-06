package com.powernode.test;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class MyTest {

    private IStudentDao dao;
    private SqlSession sqlSession;

    @AfterAll
    public void After() {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }

    /**
     * 证明二级缓存是存在的
     * 开启内置的二级缓存步骤：1)对实体进行序列化；2)在映射文件中添加<cache/>标签。
     */
    @Test
    public void test01() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        Student student = dao.selectStudentsById2(1);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        Student student2 = dao.selectStudentsById2(1);
        System.out.println(student2);
    }

    /**
     * 1.增删改同样也会清空二级缓存；
     * 2.对于二级缓存的清空，实质上是对所查找key对应的value置为null，而并非将Entry对象删除；
     * 3.从数据库中进行select查询的条件是：1)缓存中根本就不存在这个key；2)缓存中存在该key所对应的Entry对象，但其value为null。
     */
    @Test
    public void test02() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        Student student = dao.selectStudentsById2(1);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        //插入
        dao.insertStudent(new Student("", 0, 0));

        Student student2 = dao.selectStudentsById2(1);
        System.out.println(student2);
    }

}
