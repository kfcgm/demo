package com.entity.view;

import com.entity.DiscussjiancaishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 建材商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 21:08:10
 */
@TableName("discussjiancaishangpin")
public class DiscussjiancaishangpinView  extends DiscussjiancaishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiancaishangpinView(){
	}
 
 	public DiscussjiancaishangpinView(DiscussjiancaishangpinEntity discussjiancaishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiancaishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
