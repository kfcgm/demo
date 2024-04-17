package com.dao;

import com.entity.LianxixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LianxixinxiVO;
import com.entity.view.LianxixinxiView;


/**
 * 联系信息
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface LianxixinxiDao extends BaseMapper<LianxixinxiEntity> {
	
	List<LianxixinxiVO> selectListVO(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
	
	LianxixinxiVO selectVO(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
	
	List<LianxixinxiView> selectListView(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);

	List<LianxixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
	
	LianxixinxiView selectView(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
	
}
