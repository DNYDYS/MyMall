package com.admin.mall.service;

import com.admin.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author Lyy
 * @date 2020/12/19 12:20
 **/
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand (PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum,int pageSize);

    PmsBrand getBrand (Long id);
}
