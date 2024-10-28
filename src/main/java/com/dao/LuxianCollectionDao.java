package com.dao;

import com.entity.LuxianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxianCollectionView;

/**
 * 路线收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface LuxianCollectionDao extends BaseMapper<LuxianCollectionEntity> {

   List<LuxianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
