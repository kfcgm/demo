package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancaileixingView;


/**
 * 建材类型
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface JiancaileixingService extends IService<JiancaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancaileixingVO> selectListVO(Wrapper<JiancaileixingEntity> wrapper);
   	
   	JiancaileixingVO selectVO(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
   	
   	List<JiancaileixingView> selectListView(Wrapper<JiancaileixingEntity> wrapper);
   	
   	JiancaileixingView selectView(@Param("ew") Wrapper<JiancaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancaileixingEntity> wrapper);
   	
}

