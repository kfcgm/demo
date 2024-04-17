package com.dao;

import com.entity.JiancaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancaishangpinVO;
import com.entity.view.JiancaishangpinView;


/**
 * 建材商品
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface JiancaishangpinDao extends BaseMapper<JiancaishangpinEntity> {
	
	List<JiancaishangpinVO> selectListVO(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
	
	JiancaishangpinVO selectVO(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
	
	List<JiancaishangpinView> selectListView(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);

	List<JiancaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
	
	JiancaishangpinView selectView(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
	
}
