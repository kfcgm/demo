package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianxixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LianxixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LianxixinxiView;


/**
 * 联系信息
 *
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public interface LianxixinxiService extends IService<LianxixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LianxixinxiVO> selectListVO(Wrapper<LianxixinxiEntity> wrapper);
   	
   	LianxixinxiVO selectVO(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
   	
   	List<LianxixinxiView> selectListView(Wrapper<LianxixinxiEntity> wrapper);
   	
   	LianxixinxiView selectView(@Param("ew") Wrapper<LianxixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LianxixinxiEntity> wrapper);
   	
}

