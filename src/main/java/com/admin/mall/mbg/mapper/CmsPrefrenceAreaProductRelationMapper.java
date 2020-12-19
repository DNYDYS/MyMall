package com.admin.mall.mbg.mapper;

import com.admin.mall.mbg.model.CmsPrefrenceAreaProductRelation;
import com.admin.mall.mbg.model.CmsPrefrenceAreaProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int countByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int deleteByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int insert(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int insertSelective(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    List<CmsPrefrenceAreaProductRelation> selectByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByExample(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}