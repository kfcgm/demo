package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongjiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongjiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongjiangView;


/**
 * 工匠
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface GongjiangService extends IService<GongjiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongjiangVO> selectListVO(Wrapper<GongjiangEntity> wrapper);
   	
   	GongjiangVO selectVO(@Param("ew") Wrapper<GongjiangEntity> wrapper);
   	
   	List<GongjiangView> selectListView(Wrapper<GongjiangEntity> wrapper);
   	
   	GongjiangView selectView(@Param("ew") Wrapper<GongjiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongjiangEntity> wrapper);
   	
}

