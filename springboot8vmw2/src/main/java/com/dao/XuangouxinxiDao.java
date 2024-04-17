package com.dao;

import com.entity.XuangouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuangouxinxiVO;
import com.entity.view.XuangouxinxiView;


/**
 * 选购信息
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface XuangouxinxiDao extends BaseMapper<XuangouxinxiEntity> {
	
	List<XuangouxinxiVO> selectListVO(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
	
	XuangouxinxiVO selectVO(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
	
	List<XuangouxinxiView> selectListView(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);

	List<XuangouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
	
	XuangouxinxiView selectView(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
	
}
