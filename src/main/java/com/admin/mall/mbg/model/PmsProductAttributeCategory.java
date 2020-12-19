package com.admin.mall.mbg.model;

import java.io.Serializable;

public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    private Integer attributeCount;

    private Integer paramCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.id
     *
     * @return the value of pms_product_attribute_category.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.id
     *
     * @param id the value for pms_product_attribute_category.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.name
     *
     * @return the value of pms_product_attribute_category.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.name
     *
     * @param name the value for pms_product_attribute_category.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.attribute_count
     *
     * @return the value of pms_product_attribute_category.attribute_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.attribute_count
     *
     * @param attributeCount the value for pms_product_attribute_category.attribute_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute_category.param_count
     *
     * @return the value of pms_product_attribute_category.param_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute_category.param_count
     *
     * @param paramCount the value for pms_product_attribute_category.param_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}