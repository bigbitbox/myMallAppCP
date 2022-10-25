package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author rui
 * @email ungatz@hotmail.com
 * @date 2022-10-25 10:00:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
