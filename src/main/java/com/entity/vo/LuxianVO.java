package com.entity.vo;

import com.entity.LuxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("luxian")
public class LuxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
