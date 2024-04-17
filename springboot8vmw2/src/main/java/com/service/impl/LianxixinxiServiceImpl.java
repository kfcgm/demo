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


import com.dao.LianxixinxiDao;
import com.entity.LianxixinxiEntity;
import com.service.LianxixinxiService;
import com.entity.vo.LianxixinxiVO;
import com.entity.view.LianxixinxiView;

@Service("lianxixinxiService")
public class LianxixinxiServiceImpl extends ServiceImpl<LianxixinxiDao, LianxixinxiEntity> implements LianxixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LianxixinxiEntity> page = this.selectPage(
                new Query<LianxixinxiEntity>(params).getPage(),
                new EntityWrapper<LianxixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LianxixinxiEntity> wrapper) {
		  Page<LianxixinxiView> page =new Query<LianxixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LianxixinxiVO> selectListVO(Wrapper<LianxixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LianxixinxiVO selectVO(Wrapper<LianxixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LianxixinxiView> selectListView(Wrapper<LianxixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LianxixinxiView selectView(Wrapper<LianxixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
