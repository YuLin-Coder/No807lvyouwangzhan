package com.dao;

import com.entity.JingdianOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianOrderView;

/**
 * 景点订单  Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface JingdianOrderDao extends BaseMapper<JingdianOrderEntity> {

   List<JingdianOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
