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


import com.dao.DiscusszhuangxiutaocanDao;
import com.entity.DiscusszhuangxiutaocanEntity;
import com.service.DiscusszhuangxiutaocanService;
import com.entity.vo.DiscusszhuangxiutaocanVO;
import com.entity.view.DiscusszhuangxiutaocanView;

@Service("discusszhuangxiutaocanService")
public class DiscusszhuangxiutaocanServiceImpl extends ServiceImpl<DiscusszhuangxiutaocanDao, DiscusszhuangxiutaocanEntity> implements DiscusszhuangxiutaocanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhuangxiutaocanEntity> page = this.selectPage(
                new Query<DiscusszhuangxiutaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusszhuangxiutaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhuangxiutaocanEntity> wrapper) {
		  Page<DiscusszhuangxiutaocanView> page =new Query<DiscusszhuangxiutaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhuangxiutaocanVO> selectListVO(Wrapper<DiscusszhuangxiutaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhuangxiutaocanVO selectVO(Wrapper<DiscusszhuangxiutaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhuangxiutaocanView> selectListView(Wrapper<DiscusszhuangxiutaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhuangxiutaocanView selectView(Wrapper<DiscusszhuangxiutaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
