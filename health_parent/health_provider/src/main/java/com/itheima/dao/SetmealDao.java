package com.itheima.dao;

import com.itheima.pojo.Setmeal;

import java.util.Map;

/**
 * @program: Itcast_health
 * @InterfaceName: SetmealDao
 * @description:
 * @author: KyleSun
 **/
public interface SetmealDao {

    // 新增套餐_1_插入套餐数据
    void add(Setmeal setmeal);

    // 设置套餐和检查项的多对多的关联关系
    void setRelOfMealAndGroup(Map<String, Integer> map);
}
