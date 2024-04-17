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


import com.dao.ZhuangxiutaocanDao;
import com.entity.ZhuangxiutaocanEntity;
import com.service.ZhuangxiutaocanService;
import com.entity.vo.ZhuangxiutaocanVO;
import com.entity.view.ZhuangxiutaocanView;

@Service("zhuangxiutaocanService")
public class ZhuangxiutaocanServiceImpl extends ServiceImpl<ZhuangxiutaocanDao, ZhuangxiutaocanEntity> implements ZhuangxiutaocanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiutaocanEntity> page = this.selectPage(
                new Query<ZhuangxiutaocanEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiutaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiutaocanEntity> wrapper) {
		  Page<ZhuangxiutaocanView> page =new Query<ZhuangxiutaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangxiutaocanVO> selectListVO(Wrapper<ZhuangxiutaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiutaocanVO selectVO(Wrapper<ZhuangxiutaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiutaocanView> selectListView(Wrapper<ZhuangxiutaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiutaocanView selectView(Wrapper<ZhuangxiutaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
