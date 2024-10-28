package com.entity.view;

import com.entity.LuxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 路线
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("luxian")
public class LuxianView extends LuxianEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 路线类型的值
		*/
		private String luxianValue;



	public LuxianView() {

	}

	public LuxianView(LuxianEntity luxianEntity) {
		try {
			BeanUtils.copyProperties(this, luxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 路线类型的值
			*/
			public String getLuxianValue() {
				return luxianValue;
			}
			/**
			* 设置： 路线类型的值
			*/
			public void setLuxianValue(String luxianValue) {
				this.luxianValue = luxianValue;
			}















}
