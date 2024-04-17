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


import com.dao.JiancaishangpinDao;
import com.entity.JiancaishangpinEntity;
import com.service.JiancaishangpinService;
import com.entity.vo.JiancaishangpinVO;
import com.entity.view.JiancaishangpinView;

@Service("jiancaishangpinService")
public class JiancaishangpinServiceImpl extends ServiceImpl<JiancaishangpinDao, JiancaishangpinEntity> implements JiancaishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancaishangpinEntity> page = this.selectPage(
                new Query<JiancaishangpinEntity>(params).getPage(),
                new EntityWrapper<JiancaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancaishangpinEntity> wrapper) {
		  Page<JiancaishangpinView> page =new Query<JiancaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancaishangpinVO> selectListVO(Wrapper<JiancaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancaishangpinVO selectVO(Wrapper<JiancaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancaishangpinView> selectListView(Wrapper<JiancaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancaishangpinView selectView(Wrapper<JiancaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
