package com.powernode.dao;

import com.powernode.po.NewsLabel;

import java.util.List;

public interface INewsLabelDao {

    List<NewsLabel> selectChildrenByParent(int pid);

}
