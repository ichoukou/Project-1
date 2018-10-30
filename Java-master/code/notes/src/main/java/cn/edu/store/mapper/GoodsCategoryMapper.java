package cn.edu.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.store.bean.GoodsCategory;

public interface GoodsCategoryMapper {

	@Deprecated
	List<GoodsCategory> getGoodsCategoryList(Integer offset);

	GoodsCategory getGoodsCategroyById(Integer id);

	List<GoodsCategory> getGoodsCategoryListByParentId(@Param("parentId") Integer parentId,
			@Param("offset") Integer offset, @Param("pageCount") Integer pageCount);

}
