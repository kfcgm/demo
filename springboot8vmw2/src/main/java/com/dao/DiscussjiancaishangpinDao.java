package com.dao;

import com.entity.DiscussjiancaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiancaishangpinVO;
import com.entity.view.DiscussjiancaishangpinView;


/**
 * 建材商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface DiscussjiancaishangpinDao extends BaseMapper<DiscussjiancaishangpinEntity> {
	
	List<DiscussjiancaishangpinVO> selectListVO(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
	
	DiscussjiancaishangpinVO selectVO(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
	
	List<DiscussjiancaishangpinView> selectListView(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);

	List<DiscussjiancaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
	
	DiscussjiancaishangpinView selectView(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
	
}
