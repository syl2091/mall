package com.lege.dao;

import com.lege.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lege
 * @Description 搜索系统中的商品管理自定义Dao
 * @create 2022-06-15 9:45
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
