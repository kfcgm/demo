package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongjiangDao;
import com.entity.GongjiangEntity;
import com.service.GongjiangService;
import com.entity.vo.GongjiangVO;
import com.entity.view.GongjiangView;

@Service("gongjiangService")
public class GongjiangServiceImpl extends ServiceImpl<GongjiangDao, GongjiangEntity> implements GongjiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongjiangEntity> page = this.selectPage(
                new Query<GongjiangEntity>(params).getPage(),
                new EntityWrapper<GongjiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongjiangEntity> wrapper) {
		  Page<GongjiangView> page =new Query<GongjiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongjiangVO> selectListVO(Wrapper<GongjiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongjiangVO selectVO(Wrapper<GongjiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongjiangView> selectListView(Wrapper<GongjiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongjiangView selectView(Wrapper<GongjiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
