package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancaishangpinView;


/**
 * 建材商品
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface JiancaishangpinService extends IService<JiancaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancaishangpinVO> selectListVO(Wrapper<JiancaishangpinEntity> wrapper);
   	
   	JiancaishangpinVO selectVO(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
   	
   	List<JiancaishangpinView> selectListView(Wrapper<JiancaishangpinEntity> wrapper);
   	
   	JiancaishangpinView selectView(@Param("ew") Wrapper<JiancaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancaishangpinEntity> wrapper);
   	
}

