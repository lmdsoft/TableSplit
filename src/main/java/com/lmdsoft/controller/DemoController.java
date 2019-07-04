package com.lmdsoft.controller;
import com.lmdsoft.entity.Demo;
import com.lmdsoft.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 17:07
 * @Version V1.0
 * @Description: 测试demo
 **/

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoServiceImpl demoServiceImpl;

    /**
     * 根据id删除
     * 要求转入 id
     * @param id
     * @return
     */
    @GetMapping("/deleteByPrimaryKey/{id}")
    public Object deleteByPrimaryKey(@PathVariable("id") int id) {
        try {

            return demoServiceImpl.deleteByPrimaryKey(id) > 0 ? "删除成功" : "删除失败";
        } catch (Exception ex) {
            return "出错,请重试！";
        }
    }

    /**
     * 添加对象demo
     * @param demo
     * @return
     */
    @PostMapping("/insert")
    public Object insert(@RequestBody Demo demo) {
        try {
            return demoServiceImpl.insert(demo) > 0 ? "添加成功！" : "添加失败！";
        } catch (Exception ex) {
            return "出错,请重试！";
        }

    }

    /**
     * 根据id查找对象  最多只能返回一个对象
     * @param id
     * @return
     */
    @GetMapping("/selectByPrimaryKey/{id}")
    public Object selectByPrimaryKey(@PathVariable("id") int id) {
        try {
            Demo demo1 = demoServiceImpl.selectByPrimaryKey(id);
            if (demo1 == null) {
                return "无数据";
            } else {
                return demo1;
            }
        } catch (Exception ex) {
            return "出错,请重试！";
        }
    }

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("/selectAll")
    public Object selectAll() {
        try {
            List<Demo> list = demoServiceImpl.selectAll();
            if (list == null) {
                return "无数据";
            } else {
                return list;
            }
        } catch (Exception ex) {
            return "出错,请重试！";
        }
    }

    /**
     * 根据id修改全部字段
     * @param demo
     * @return
     */
    @PutMapping(value = "/updateByPrimaryKey")
    public Object updateByPrimaryKey(@RequestBody Demo demo) {
        try {
            return demoServiceImpl.updateByPrimaryKey(demo) > 0 ? "修改成功" : "修改失败";
        } catch (Exception ex) {
            return "出错,请重试！";
        }


    }
}
