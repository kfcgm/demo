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


import com.dao.XuangouxinxiDao;
import com.entity.XuangouxinxiEntity;
import com.service.XuangouxinxiService;
import com.entity.vo.XuangouxinxiVO;
import com.entity.view.XuangouxinxiView;

@Service("xuangouxinxiService")
public class XuangouxinxiServiceImpl extends ServiceImpl<XuangouxinxiDao, XuangouxinxiEntity> implements XuangouxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuangouxinxiEntity> page = this.selectPage(
                new Query<XuangouxinxiEntity>(params).getPage(),
                new EntityWrapper<XuangouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuangouxinxiEntity> wrapper) {
		  Page<XuangouxinxiView> page =new Query<XuangouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuangouxinxiVO> selectListVO(Wrapper<XuangouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuangouxinxiVO selectVO(Wrapper<XuangouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuangouxinxiView> selectListView(Wrapper<XuangouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuangouxinxiView selectView(Wrapper<XuangouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
