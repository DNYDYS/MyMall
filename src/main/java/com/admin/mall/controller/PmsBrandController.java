package com.admin.mall.controller;

import com.admin.mall.common.api.CommonPage;
import com.admin.mall.common.api.CommonResult;
import com.admin.mall.mbg.model.PmsBrand;
import com.admin.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌管理Controller
 * @author Lyy
 * @date 2020/12/19 16:59
 **/

@Api(tags = "PmsBrandController",description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    private PmsBrandService pmsBrandService;

    @ApiOperation("获取所有品牌列表")
    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList(){
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @ApiOperation("添加品牌")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult createBrand( PmsBrand pmsBrand){
        CommonResult commonResult;
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1){
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("createBrand success{}",pmsBrand);
        }else{
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed{}",pmsBrand);
        }
        return commonResult;
    }

    @ApiOperation("修改指定id的品牌")
    @PostMapping("/update/{id}")
    @ResponseBody
    //@PathVariable("id") Long id,  有可能替换@Param("id")
//    @ResponseBody("pmsBrandDto") PmsBrand pmsBrandDto,
    public CommonResult updateBrand(@Param("id") long id,PmsBrand pmsBrandDto, BindingResult result){
        CommonResult commonResult;
        int count = pmsBrandService.updateBrand(id,pmsBrandDto);
        if (count == 1){
            commonResult = CommonResult.success(pmsBrandDto);
            LOGGER.debug("updateBrand success{}",pmsBrandDto);
        }else{
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("upadteBrand failed{}",pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的品牌")
    @PostMapping("/delete/{id}")
    @ResponseBody
    //@PathVariable("id") Long id,  有可能替换@Param("id")
    public CommonResult deleteBrand(@PathVariable("id") Long id){
        CommonResult commonResult;
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1){
            commonResult = CommonResult.success(id);
            LOGGER.debug("deleteBrand success{}",id);
        }else{
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("deleteBrand failed{}",id);
        }
        return commonResult;
    }


    @ApiOperation("分页查询产品列表")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> lsitBrand(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                        @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }


    @ApiOperation("获取指定id的品牌详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<PmsBrand> brand (@PathVariable("id") Long id){
        return CommonResult.success(pmsBrandService.getBrand(id));
    }

}
