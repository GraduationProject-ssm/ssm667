package com.dao;

import com.entity.ShicixuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicixuexiView;

/**
 * 诗词学习 Dao 接口
 *
 * @author 
 */
public interface ShicixuexiDao extends BaseMapper<ShicixuexiEntity> {

   List<ShicixuexiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
