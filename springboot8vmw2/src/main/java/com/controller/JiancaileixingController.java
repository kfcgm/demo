package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiancaileixingEntity;
import com.entity.view.JiancaileixingView;

import com.service.JiancaileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 建材类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
@RestController
@RequestMapping("/jiancaileixing")
public class JiancaileixingController {
    @Autowired
    private JiancaileixingService jiancaileixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiancaileixingEntity jiancaileixing, HttpServletRequest request){
        EntityWrapper<JiancaileixingEntity> ew = new EntityWrapper<JiancaileixingEntity>();
		PageUtils page = jiancaileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancaileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiancaileixingEntity jiancaileixing, HttpServletRequest request){
        EntityWrapper<JiancaileixingEntity> ew = new EntityWrapper<JiancaileixingEntity>();
		PageUtils page = jiancaileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancaileixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiancaileixingEntity jiancaileixing){
       	EntityWrapper<JiancaileixingEntity> ew = new EntityWrapper<JiancaileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiancaileixing, "jiancaileixing")); 
        return R.ok().put("data", jiancaileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiancaileixingEntity jiancaileixing){
        EntityWrapper< JiancaileixingEntity> ew = new EntityWrapper< JiancaileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiancaileixing, "jiancaileixing")); 
		JiancaileixingView jiancaileixingView =  jiancaileixingService.selectView(ew);
		return R.ok("查询建材类型成功").put("data", jiancaileixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiancaileixingEntity jiancaileixing = jiancaileixingService.selectById(id);
        return R.ok().put("data", jiancaileixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiancaileixingEntity jiancaileixing = jiancaileixingService.selectById(id);
        return R.ok().put("data", jiancaileixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiancaileixingEntity jiancaileixing, HttpServletRequest request){
    	jiancaileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancaileixing);
        jiancaileixingService.insert(jiancaileixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiancaileixingEntity jiancaileixing, HttpServletRequest request){
    	jiancaileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancaileixing);
        jiancaileixingService.insert(jiancaileixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiancaileixingEntity jiancaileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiancaileixing);
        jiancaileixingService.updateById(jiancaileixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiancaileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiancaileixingEntity> wrapper = new EntityWrapper<JiancaileixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiancaileixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
