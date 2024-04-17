package com.dao;

import com.entity.DiscusszhuangxiutaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhuangxiutaocanVO;
import com.entity.view.DiscusszhuangxiutaocanView;


/**
 * 装修套餐评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface DiscusszhuangxiutaocanDao extends BaseMapper<DiscusszhuangxiutaocanEntity> {
	
	List<DiscusszhuangxiutaocanVO> selectListVO(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
	
	DiscusszhuangxiutaocanVO selectVO(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
	
	List<DiscusszhuangxiutaocanView> selectListView(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);

	List<DiscusszhuangxiutaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
	
	DiscusszhuangxiutaocanView selectView(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
	
}
