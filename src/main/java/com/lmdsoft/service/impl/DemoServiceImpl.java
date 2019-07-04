package com.lmdsoft.service.impl;

import com.lmdsoft.dao.DemoMapper;
import com.lmdsoft.entity.Demo;
import com.lmdsoft.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 17:07
 * @Version V1.0
 * @Description: Service实现层
 **/

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    /**
     * 删除操作 根据id删除
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return demoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加操作
     * @param demo
     * @return
     */
    @Override
    public int insert(Demo demo) {
        return demoMapper.insert(demo);
    }

    /**
     * 根据id查询操作
     * @param id
     * @return
     */
    @Override
    public Demo selectByPrimaryKey(Integer id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    /**
     * 全部查询操作
     * @return
     */
    @Override
    public List<Demo> selectAll() {
        return demoMapper.selectAll();
    }

    /**
     * 修改操作
     * @param demo
     * @return
     */
    @Override
    public int updateByPrimaryKey(Demo demo) {
        return demoMapper.updateByPrimaryKey(demo);
    }
}
