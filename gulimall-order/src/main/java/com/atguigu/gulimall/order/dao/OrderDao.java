package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author rui
 * @email ungatz@hotmail.com
 * @date 2022-10-25 10:08:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
