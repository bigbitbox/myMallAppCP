package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author rui
 * @email ungatz@hotmail.com
 * @date 2022-10-24 15:49:31
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
