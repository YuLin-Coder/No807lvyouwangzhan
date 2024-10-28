package com.entity.model;

import com.entity.LuxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class LuxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 路线经过景点
     */
    private String luxianJingdian;


    /**
     * 路线大概总花费
     */
    private Integer luxianNewMoney;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：路线名
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 设置：路线名
	 */
    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 获取：路线照片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 设置：路线照片
	 */
    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 获取：路线详情
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 设置：路线详情
	 */
    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 获取：路线类型
	 */
    public Integer getLuxianTypes() {
        return luxianTypes;
    }


    /**
	 * 设置：路线类型
	 */
    public void setLuxianTypes(Integer luxianTypes) {
        this.luxianTypes = luxianTypes;
    }
    /**
	 * 获取：路线经过景点
	 */
    public String getLuxianJingdian() {
        return luxianJingdian;
    }


    /**
	 * 设置：路线经过景点
	 */
    public void setLuxianJingdian(String luxianJingdian) {
        this.luxianJingdian = luxianJingdian;
    }
    /**
	 * 获取：路线大概总花费
	 */
    public Integer getLuxianNewMoney() {
        return luxianNewMoney;
    }


    /**
	 * 设置：路线大概总花费
	 */
    public void setLuxianNewMoney(Integer luxianNewMoney) {
        this.luxianNewMoney = luxianNewMoney;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
