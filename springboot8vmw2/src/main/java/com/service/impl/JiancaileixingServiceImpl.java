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


import com.dao.JiancaileixingDao;
import com.entity.JiancaileixingEntity;
import com.service.JiancaileixingService;
import com.entity.vo.JiancaileixingVO;
import com.entity.view.JiancaileixingView;

@Service("jiancaileixingService")
public class JiancaileixingServiceImpl extends ServiceImpl<JiancaileixingDao, JiancaileixingEntity> implements JiancaileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancaileixingEntity> page = this.selectPage(
                new Query<JiancaileixingEntity>(params).getPage(),
                new EntityWrapper<JiancaileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancaileixingEntity> wrapper) {
		  Page<JiancaileixingView> page =new Query<JiancaileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancaileixingVO> selectListVO(Wrapper<JiancaileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancaileixingVO selectVO(Wrapper<JiancaileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancaileixingView> selectListView(Wrapper<JiancaileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancaileixingView selectView(Wrapper<JiancaileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
