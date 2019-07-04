package com.lmdsoft.service;

import com.lmdsoft.entity.Demo;
import java.util.List;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 17:07
 * @Version V1.0
 * @Description: service层
 **/

public interface DemoService {

    /**
     * 删除操作 根据id
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加操作
     * @param demo
     * @return
     */
    int insert(Demo demo);

    /**
     * 根据id查询操作
     * @param id
     * @return
     */
    Demo selectByPrimaryKey(Integer id);

    /**
     * 全部查询操作
     * @return
     */
    List<Demo> selectAll();

    /**
     * 修改操作
     * @param demo
     * @return
     */
    int updateByPrimaryKey(Demo demo);
}