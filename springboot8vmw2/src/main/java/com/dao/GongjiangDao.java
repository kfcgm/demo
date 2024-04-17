package com.dao;

import com.entity.GongjiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongjiangVO;
import com.entity.view.GongjiangView;


/**
 * 工匠
 * 
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface GongjiangDao extends BaseMapper<GongjiangEntity> {
	
	List<GongjiangVO> selectListVO(@Param("ew") Wrapper<GongjiangEntity> wrapper);
	
	GongjiangVO selectVO(@Param("ew") Wrapper<GongjiangEntity> wrapper);
	
	List<GongjiangView> selectListView(@Param("ew") Wrapper<GongjiangEntity> wrapper);

	List<GongjiangView> selectListView(Pagination page,@Param("ew") Wrapper<GongjiangEntity> wrapper);
	
	GongjiangView selectView(@Param("ew") Wrapper<GongjiangEntity> wrapper);
	
}
