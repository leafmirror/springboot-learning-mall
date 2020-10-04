package com.leafmirror.malllearning.dao;

import com.leafmirror.malllearning.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
