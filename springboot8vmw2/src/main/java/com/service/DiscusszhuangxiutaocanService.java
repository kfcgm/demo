package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhuangxiutaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhuangxiutaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhuangxiutaocanView;


/**
 * 装修套餐评论表
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface DiscusszhuangxiutaocanService extends IService<DiscusszhuangxiutaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhuangxiutaocanVO> selectListVO(Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
   	
   	DiscusszhuangxiutaocanVO selectVO(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
   	
   	List<DiscusszhuangxiutaocanView> selectListView(Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
   	
   	DiscusszhuangxiutaocanView selectView(@Param("ew") Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhuangxiutaocanEntity> wrapper);
   	
}

