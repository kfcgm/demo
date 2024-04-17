package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuangouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuangouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuangouxinxiView;


/**
 * 选购信息
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface XuangouxinxiService extends IService<XuangouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuangouxinxiVO> selectListVO(Wrapper<XuangouxinxiEntity> wrapper);
   	
   	XuangouxinxiVO selectVO(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
   	
   	List<XuangouxinxiView> selectListView(Wrapper<XuangouxinxiEntity> wrapper);
   	
   	XuangouxinxiView selectView(@Param("ew") Wrapper<XuangouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuangouxinxiEntity> wrapper);
   	
}

