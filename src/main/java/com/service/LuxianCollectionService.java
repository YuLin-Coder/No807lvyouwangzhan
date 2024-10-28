package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuxianCollectionEntity;
import java.util.Map;

/**
 * 路线收藏 服务类
 * @author 
 * @since 2021-04-07
 */
public interface LuxianCollectionService extends IService<LuxianCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}