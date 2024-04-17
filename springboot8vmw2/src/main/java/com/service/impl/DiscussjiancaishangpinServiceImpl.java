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


import com.dao.DiscussjiancaishangpinDao;
import com.entity.DiscussjiancaishangpinEntity;
import com.service.DiscussjiancaishangpinService;
import com.entity.vo.DiscussjiancaishangpinVO;
import com.entity.view.DiscussjiancaishangpinView;

@Service("discussjiancaishangpinService")
public class DiscussjiancaishangpinServiceImpl extends ServiceImpl<DiscussjiancaishangpinDao, DiscussjiancaishangpinEntity> implements DiscussjiancaishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiancaishangpinEntity> page = this.selectPage(
                new Query<DiscussjiancaishangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussjiancaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiancaishangpinEntity> wrapper) {
		  Page<DiscussjiancaishangpinView> page =new Query<DiscussjiancaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiancaishangpinVO> selectListVO(Wrapper<DiscussjiancaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiancaishangpinVO selectVO(Wrapper<DiscussjiancaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiancaishangpinView> selectListView(Wrapper<DiscussjiancaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiancaishangpinView selectView(Wrapper<DiscussjiancaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
