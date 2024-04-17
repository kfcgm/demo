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

import com.entity.ZhuangxiutaocanEntity;
import com.entity.view.ZhuangxiutaocanView;

import com.service.ZhuangxiutaocanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 装修套餐
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
@RestController
@RequestMapping("/zhuangxiutaocan")
public class ZhuangxiutaocanController {
    @Autowired
    private ZhuangxiutaocanService zhuangxiutaocanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuangxiutaocanEntity zhuangxiutaocan, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gongjiang")) {
			zhuangxiutaocan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuangxiutaocanEntity> ew = new EntityWrapper<ZhuangxiutaocanEntity>();
		PageUtils page = zhuangxiutaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiutaocan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuangxiutaocanEntity zhuangxiutaocan, HttpServletRequest request){
        EntityWrapper<ZhuangxiutaocanEntity> ew = new EntityWrapper<ZhuangxiutaocanEntity>();
		PageUtils page = zhuangxiutaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuangxiutaocan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuangxiutaocanEntity zhuangxiutaocan){
       	EntityWrapper<ZhuangxiutaocanEntity> ew = new EntityWrapper<ZhuangxiutaocanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuangxiutaocan, "zhuangxiutaocan")); 
        return R.ok().put("data", zhuangxiutaocanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuangxiutaocanEntity zhuangxiutaocan){
        EntityWrapper< ZhuangxiutaocanEntity> ew = new EntityWrapper< ZhuangxiutaocanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuangxiutaocan, "zhuangxiutaocan")); 
		ZhuangxiutaocanView zhuangxiutaocanView =  zhuangxiutaocanService.selectView(ew);
		return R.ok("查询装修套餐成功").put("data", zhuangxiutaocanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuangxiutaocanEntity zhuangxiutaocan = zhuangxiutaocanService.selectById(id);
        return R.ok().put("data", zhuangxiutaocan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuangxiutaocanEntity zhuangxiutaocan = zhuangxiutaocanService.selectById(id);
        return R.ok().put("data", zhuangxiutaocan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuangxiutaocanEntity zhuangxiutaocan, HttpServletRequest request){
    	zhuangxiutaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuangxiutaocan);
        zhuangxiutaocanService.insert(zhuangxiutaocan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuangxiutaocanEntity zhuangxiutaocan, HttpServletRequest request){
    	zhuangxiutaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuangxiutaocan);
        zhuangxiutaocanService.insert(zhuangxiutaocan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuangxiutaocanEntity zhuangxiutaocan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuangxiutaocan);
        zhuangxiutaocanService.updateById(zhuangxiutaocan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuangxiutaocanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhuangxiutaocanEntity> wrapper = new EntityWrapper<ZhuangxiutaocanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gongjiang")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuangxiutaocanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
