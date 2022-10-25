package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author rui
 * @email ungatz@hotmail.com
 * @date 2022-10-25 09:36:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
