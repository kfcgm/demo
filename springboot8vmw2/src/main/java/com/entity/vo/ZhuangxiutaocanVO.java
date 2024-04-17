package com.entity.vo;

import com.entity.ZhuangxiutaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装修套餐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
public class ZhuangxiutaocanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 装修类型
	 */
	
	private String zhuangxiuleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 装修材料
	 */
	
	private String zhuangxiucailiao;
		
	/**
	 * 完工时间
	 */
	
	private String wangongshijian;
		
	/**
	 * 装修详情
	 */
	
	private String zhuangxiuxiangqing;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：装修类型
	 */
	 
	public void setZhuangxiuleixing(String zhuangxiuleixing) {
		this.zhuangxiuleixing = zhuangxiuleixing;
	}
	
	/**
	 * 获取：装修类型
	 */
	public String getZhuangxiuleixing() {
		return zhuangxiuleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：装修材料
	 */
	 
	public void setZhuangxiucailiao(String zhuangxiucailiao) {
		this.zhuangxiucailiao = zhuangxiucailiao;
	}
	
	/**
	 * 获取：装修材料
	 */
	public String getZhuangxiucailiao() {
		return zhuangxiucailiao;
	}
				
	
	/**
	 * 设置：完工时间
	 */
	 
	public void setWangongshijian(String wangongshijian) {
		this.wangongshijian = wangongshijian;
	}
	
	/**
	 * 获取：完工时间
	 */
	public String getWangongshijian() {
		return wangongshijian;
	}
				
	
	/**
	 * 设置：装修详情
	 */
	 
	public void setZhuangxiuxiangqing(String zhuangxiuxiangqing) {
		this.zhuangxiuxiangqing = zhuangxiuxiangqing;
	}
	
	/**
	 * 获取：装修详情
	 */
	public String getZhuangxiuxiangqing() {
		return zhuangxiuxiangqing;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
