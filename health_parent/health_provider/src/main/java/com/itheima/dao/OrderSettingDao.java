package com.itheima.dao;

import com.itheima.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program: Itcast_health
 * @InterfaceName: OrderSettingDao
 * @description:
 * @author: KyleSun
 * @create: 21:10 2020/4/16
 **/
public interface OrderSettingDao {

    // 根据指定预约日期查询数据库是否已经设置
    long findCountByOrderDate(Date orderDate);

    // 数据批量导入到数据库: 数据库已有设置 --> 更新
    void editNumberByOrderDate(OrderSetting orderSetting);

    // 数据批量导入到数据库: 数据库没有设置 --> 添加
    void add(OrderSetting orderSetting);

    // 根据月份查询该月份内所有的预约数据
    List<Map> getOrderSettingByMonth(String date);
}