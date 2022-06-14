package com.lege.service;

import com.lege.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author lege
 * @Description
 * @create 2022-06-13 17:22
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}