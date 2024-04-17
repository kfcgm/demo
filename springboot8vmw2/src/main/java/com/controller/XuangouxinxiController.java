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

import com.dao.XuangouxinxiDao;
import com.dao.YonghuDao;
import com.entity.YonghuEntity;
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

import com.entity.XuangouxinxiEntity;
import com.entity.view.XuangouxinxiView;

import com.service.XuangouxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 选购信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
@RestController
@RequestMapping("/xuangouxinxi")
public class XuangouxinxiController {
    @Autowired
    private XuangouxinxiService xuangouxinxiService;
    @Autowired
    private YonghuDao yonghuDao;
    @Autowired
    private XuangouxinxiDao xuangouxinxiDao;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuangouxinxiEntity xuangouxinxi, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gongjiang")) {
			xuangouxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xuangouxinxi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuangouxinxiEntity> ew = new EntityWrapper<XuangouxinxiEntity>();
		PageUtils page = xuangouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuangouxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuangouxinxiEntity xuangouxinxi, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gongjiang")) {
			xuangouxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xuangouxinxi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuangouxinxiEntity> ew = new EntityWrapper<XuangouxinxiEntity>();
		PageUtils page = xuangouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuangouxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuangouxinxiEntity xuangouxinxi){
       	EntityWrapper<XuangouxinxiEntity> ew = new EntityWrapper<XuangouxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuangouxinxi, "xuangouxinxi")); 
        return R.ok().put("data", xuangouxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuangouxinxiEntity xuangouxinxi){
        EntityWrapper< XuangouxinxiEntity> ew = new EntityWrapper< XuangouxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuangouxinxi, "xuangouxinxi")); 
		XuangouxinxiView xuangouxinxiView =  xuangouxinxiService.selectView(ew);
		return R.ok("查询选购信息成功").put("data", xuangouxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuangouxinxiEntity xuangouxinxi = xuangouxinxiService.selectById(id);
        return R.ok().put("data", xuangouxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuangouxinxiEntity xuangouxinxi = xuangouxinxiService.selectById(id);
        return R.ok().put("data", xuangouxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuangouxinxiEntity xuangouxinxi, HttpServletRequest request){
    	xuangouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuangouxinxi);
        xuangouxinxiService.insert(xuangouxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuangouxinxiEntity xuangouxinxi, HttpServletRequest request){
    	xuangouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuangouxinxi);
        Long userId = (Long) request.getSession().getAttribute("userId");
        xuangouxinxi.setUserid(userId);
        xuangouxinxiService.insert(xuangouxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XuangouxinxiEntity xuangouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuangouxinxi);
        Long userId = (Long) request.getSession().getAttribute("userId");
        XuangouxinxiEntity p = xuangouxinxiDao.selectById(xuangouxinxi.getId());

        if(!"已支付".equals(p.getIspay()) &&"已支付".equals(xuangouxinxi.getIspay())){
            // 扣减余额
            YonghuEntity user = yonghuDao.selectById(userId);
            if(user == null){
                return R.error("用户不存在");
            }
            Float userMoney = user.getMoney();
            try{
                String jiage = xuangouxinxi.getJiage();
                if((userMoney -Float.valueOf(jiage)) < 0){
                    return R.error("余额不足");
                }
                xuangouxinxi.setUserid((Long)request.getSession().getAttribute("userId"));
                yonghuDao.reduceMoney(userId,Float.valueOf(jiage));
            }catch (Exception e){
                e.printStackTrace();
                return R.error("套餐价格格式错误");
            }
        }
        xuangouxinxiService.updateById(xuangouxinxi);//全部更新

        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuangouxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XuangouxinxiEntity> wrapper = new EntityWrapper<XuangouxinxiEntity>();
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
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = xuangouxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
