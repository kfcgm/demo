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

import com.entity.GongjiangEntity;
import com.entity.view.GongjiangView;

import com.service.GongjiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 工匠
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
@RestController
@RequestMapping("/gongjiang")
public class GongjiangController {
    @Autowired
    private GongjiangService gongjiangService;
    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		GongjiangEntity user = gongjiangService.selectOne(new EntityWrapper<GongjiangEntity>().eq("zhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(user.getId(), username,"gongjiang",  "工匠" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody GongjiangEntity gongjiang){
    	//ValidatorUtils.validateEntity(gongjiang);
    	GongjiangEntity user = gongjiangService.selectOne(new EntityWrapper<GongjiangEntity>().eq("zhanghao", gongjiang.getZhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		gongjiang.setId(uId);
        gongjiangService.insert(gongjiang);
        return R.ok();
    }
	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        GongjiangEntity user = gongjiangService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	GongjiangEntity user = gongjiangService.selectOne(new EntityWrapper<GongjiangEntity>().eq("zhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        gongjiangService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongjiangEntity gongjiang, HttpServletRequest request){
        EntityWrapper<GongjiangEntity> ew = new EntityWrapper<GongjiangEntity>();
		PageUtils page = gongjiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongjiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongjiangEntity gongjiang, HttpServletRequest request){
        EntityWrapper<GongjiangEntity> ew = new EntityWrapper<GongjiangEntity>();
		PageUtils page = gongjiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongjiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongjiangEntity gongjiang){
       	EntityWrapper<GongjiangEntity> ew = new EntityWrapper<GongjiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongjiang, "gongjiang")); 
        return R.ok().put("data", gongjiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongjiangEntity gongjiang){
        EntityWrapper< GongjiangEntity> ew = new EntityWrapper< GongjiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongjiang, "gongjiang")); 
		GongjiangView gongjiangView =  gongjiangService.selectView(ew);
		return R.ok("查询工匠成功").put("data", gongjiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongjiangEntity gongjiang = gongjiangService.selectById(id);
        return R.ok().put("data", gongjiang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongjiangEntity gongjiang = gongjiangService.selectById(id);
        return R.ok().put("data", gongjiang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongjiangEntity gongjiang, HttpServletRequest request){
    	gongjiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongjiang);
    	GongjiangEntity user = gongjiangService.selectOne(new EntityWrapper<GongjiangEntity>().eq("zhanghao", gongjiang.getZhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		gongjiang.setId(new Date().getTime());
        gongjiangService.insert(gongjiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongjiangEntity gongjiang, HttpServletRequest request){
    	gongjiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongjiang);
    	GongjiangEntity user = gongjiangService.selectOne(new EntityWrapper<GongjiangEntity>().eq("zhanghao", gongjiang.getZhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		gongjiang.setId(new Date().getTime());
        gongjiangService.insert(gongjiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongjiangEntity gongjiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongjiang);
        gongjiangService.updateById(gongjiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongjiangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GongjiangEntity> wrapper = new EntityWrapper<GongjiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gongjiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}