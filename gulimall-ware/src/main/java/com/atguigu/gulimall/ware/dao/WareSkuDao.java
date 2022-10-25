package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author rui
 * @email ungatz@hotmail.com
 * @date 2022-10-25 10:17:53
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
