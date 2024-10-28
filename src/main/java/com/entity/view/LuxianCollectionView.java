package com.entity.view;

import com.entity.LuxianCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 路线收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("luxian_collection")
public class LuxianCollectionView extends LuxianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 luxian
			/**
			* 路线名
			*/
			private String luxianName;
			/**
			* 路线照片
			*/
			private String luxianPhoto;
			/**
			* 路线详情
			*/
			private String luxianContent;
			/**
			* 路线类型
			*/
			private Integer luxianTypes;
				/**
				* 路线类型的值
				*/
				private String luxianValue;
			/**
			* 路线经过景点
			*/
			private String luxianJingdian;
			/**
			* 路线大概总花费
			*/
			private Integer luxianNewMoney;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String idNumber;
			/**
			* 手机号
			*/
			private String phone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public LuxianCollectionView() {

	}

	public LuxianCollectionView(LuxianCollectionEntity luxianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, luxianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set luxian
					/**
					* 获取： 路线名
					*/
					public String getLuxianName() {
						return luxianName;
					}
					/**
					* 设置： 路线名
					*/
					public void setLuxianName(String luxianName) {
						this.luxianName = luxianName;
					}
					/**
					* 获取： 路线照片
					*/
					public String getLuxianPhoto() {
						return luxianPhoto;
					}
					/**
					* 设置： 路线照片
					*/
					public void setLuxianPhoto(String luxianPhoto) {
						this.luxianPhoto = luxianPhoto;
					}
					/**
					* 获取： 路线详情
					*/
					public String getLuxianContent() {
						return luxianContent;
					}
					/**
					* 设置： 路线详情
					*/
					public void setLuxianContent(String luxianContent) {
						this.luxianContent = luxianContent;
					}
					/**
					* 获取： 路线类型
					*/
					public Integer getLuxianTypes() {
						return luxianTypes;
					}
					/**
					* 设置： 路线类型
					*/
					public void setLuxianTypes(Integer luxianTypes) {
						this.luxianTypes = luxianTypes;
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
					/**
					* 获取： 路线经过景点
					*/
					public String getLuxianJingdian() {
						return luxianJingdian;
					}
					/**
					* 设置： 路线经过景点
					*/
					public void setLuxianJingdian(String luxianJingdian) {
						this.luxianJingdian = luxianJingdian;
					}
					/**
					* 获取： 路线大概总花费
					*/
					public Integer getLuxianNewMoney() {
						return luxianNewMoney;
					}
					/**
					* 设置： 路线大概总花费
					*/
					public void setLuxianNewMoney(Integer luxianNewMoney) {
						this.luxianNewMoney = luxianNewMoney;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getIdNumber() {
						return idNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setIdNumber(String idNumber) {
						this.idNumber = idNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getPhone() {
						return phone;
					}
					/**
					* 设置： 手机号
					*/
					public void setPhone(String phone) {
						this.phone = phone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
