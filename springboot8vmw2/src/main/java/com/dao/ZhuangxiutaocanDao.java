package com.dao;

import com.entity.ZhuangxiutaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiutaocanVO;
import com.entity.view.ZhuangxiutaocanView;


/**
 * 装修套餐
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface ZhuangxiutaocanDao extends BaseMapper<ZhuangxiutaocanEntity> {
	
	List<ZhuangxiutaocanVO> selectListVO(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
	
	ZhuangxiutaocanVO selectVO(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
	
	List<ZhuangxiutaocanView> selectListView(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);

	List<ZhuangxiutaocanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
	
	ZhuangxiutaocanView selectView(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
	
}
