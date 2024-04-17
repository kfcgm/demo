package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiancaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiancaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiancaishangpinView;


/**
 * 建材商品评论表
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface DiscussjiancaishangpinService extends IService<DiscussjiancaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiancaishangpinVO> selectListVO(Wrapper<DiscussjiancaishangpinEntity> wrapper);
   	
   	DiscussjiancaishangpinVO selectVO(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
   	
   	List<DiscussjiancaishangpinView> selectListView(Wrapper<DiscussjiancaishangpinEntity> wrapper);
   	
   	DiscussjiancaishangpinView selectView(@Param("ew") Wrapper<DiscussjiancaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiancaishangpinEntity> wrapper);
   	
}

