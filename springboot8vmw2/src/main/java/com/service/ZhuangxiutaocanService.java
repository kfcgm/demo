package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiutaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiutaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiutaocanView;


/**
 * 装修套餐
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface ZhuangxiutaocanService extends IService<ZhuangxiutaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiutaocanVO> selectListVO(Wrapper<ZhuangxiutaocanEntity> wrapper);
   	
   	ZhuangxiutaocanVO selectVO(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
   	
   	List<ZhuangxiutaocanView> selectListView(Wrapper<ZhuangxiutaocanEntity> wrapper);
   	
   	ZhuangxiutaocanView selectView(@Param("ew") Wrapper<ZhuangxiutaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiutaocanEntity> wrapper);
   	
}

