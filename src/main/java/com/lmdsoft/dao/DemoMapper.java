package com.lmdsoft.dao;

import com.lmdsoft.entity.Demo;
import com.lmdsoft.util.annotation.TableSplit;
import java.util.List;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 17:07
 * @Version V1.0
 * @Description: dao层数据库操作
 **/

@TableSplit(value="demo", strategy="YYYY")
public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    Demo selectByPrimaryKey(Integer id);

    List<Demo> selectAll();

    int updateByPrimaryKey(Demo record);
}