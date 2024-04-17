package com.dao;

import com.entity.JiancaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancaileixingVO;
import com.entity.view.JiancaileixingView;


/**
 * 建材类型
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface JiancaileixingDao extends BaseMapper<JiancaileixingEntity> {
	
	List<JiancaileixingVO> selectListVO(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
	
	JiancaileixingVO selectVO(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
	
	List<JiancaileixingView> selectListView(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);

	List<JiancaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
	
	JiancaileixingView selectView(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
	
}
