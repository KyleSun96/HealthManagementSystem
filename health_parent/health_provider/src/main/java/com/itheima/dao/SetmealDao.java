package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Setmeal;

import java.util.List;
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

    // 根据条件查询套餐(用于分页查询中)
    Page<Setmeal> selectByCondition(String queryString);

    // 查询所有套餐
    List<Setmeal> findAll();

    // 根据套餐的ID查询详细信息(包括套餐基本信息,套餐包含的检查组信息,检查组包含的检查项信息)
    Setmeal findById(int id);

    // 查询套餐预约占比数据
    List<Map<String, Object>> findSetmealCount();

    // 根据套餐ID查询,套餐关联多少检查组ID
    List<Integer> findRelOfMealAndGroup(Integer setmealId);

    // 清理当前套餐与检查组的关联关系
    void deleteRelation(Integer id);

    // 根据ID动态修改 套餐基本信息
    void edit(Setmeal setmeal);

}
