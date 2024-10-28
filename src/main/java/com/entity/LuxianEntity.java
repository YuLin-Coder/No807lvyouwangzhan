package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 路线
 *
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("luxian")
public class LuxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LuxianEntity() {

	}

	public LuxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 路线名
     */
    @TableField(value = "luxian_name")

    private String luxianName;


    /**
     * 路线照片
     */
    @TableField(value = "luxian_photo")

    private String luxianPhoto;


    /**
     * 路线详情
     */
    @TableField(value = "luxian_content")

    private String luxianContent;


    /**
     * 路线类型
     */
    @TableField(value = "luxian_types")

    private Integer luxianTypes;


    /**
     * 路线经过景点
     */
    @TableField(value = "luxian_jingdian")

    private String luxianJingdian;


    /**
     * 路线大概总花费
     */
    @TableField(value = "luxian_new_money")

    private Integer luxianNewMoney;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：路线名
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 获取：路线名
	 */

    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 设置：路线照片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 获取：路线照片
	 */

    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 设置：路线详情
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 获取：路线详情
	 */

    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 设置：路线类型
	 */
    public Integer getLuxianTypes() {
        return luxianTypes;
    }


    /**
	 * 获取：路线类型
	 */

    public void setLuxianTypes(Integer luxianTypes) {
        this.luxianTypes = luxianTypes;
    }
    /**
	 * 设置：路线经过景点
	 */
    public String getLuxianJingdian() {
        return luxianJingdian;
    }


    /**
	 * 获取：路线经过景点
	 */

    public void setLuxianJingdian(String luxianJingdian) {
        this.luxianJingdian = luxianJingdian;
    }
    /**
	 * 设置：路线大概总花费
	 */
    public Integer getLuxianNewMoney() {
        return luxianNewMoney;
    }


    /**
	 * 获取：路线大概总花费
	 */

    public void setLuxianNewMoney(Integer luxianNewMoney) {
        this.luxianNewMoney = luxianNewMoney;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Luxian{" +
            "id=" + id +
            ", luxianName=" + luxianName +
            ", luxianPhoto=" + luxianPhoto +
            ", luxianContent=" + luxianContent +
            ", luxianTypes=" + luxianTypes +
            ", luxianJingdian=" + luxianJingdian +
            ", luxianNewMoney=" + luxianNewMoney +
            ", createTime=" + createTime +
        "}";
    }
}
