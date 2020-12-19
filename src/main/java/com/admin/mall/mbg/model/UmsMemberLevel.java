package com.admin.mall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberLevel implements Serializable {
    private Long id;

    private String name;

    private Integer growthPoint;

    private Integer defaultStatus;

    private BigDecimal freeFreightPoint;

    private Integer commentGrowthPoint;

    private Integer priviledgeFreeFreight;

    private Integer priviledgeSignIn;

    private Integer priviledgeComment;

    private Integer priviledgePromotion;

    private Integer priviledgeMemberPrice;

    private Integer priviledgeBirthday;

    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_level
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.id
     *
     * @return the value of ums_member_level.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.id
     *
     * @param id the value for ums_member_level.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.name
     *
     * @return the value of ums_member_level.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.name
     *
     * @param name the value for ums_member_level.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.growth_point
     *
     * @return the value of ums_member_level.growth_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.growth_point
     *
     * @param growthPoint the value for ums_member_level.growth_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.default_status
     *
     * @return the value of ums_member_level.default_status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.default_status
     *
     * @param defaultStatus the value for ums_member_level.default_status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.free_freight_point
     *
     * @return the value of ums_member_level.free_freight_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.free_freight_point
     *
     * @param freeFreightPoint the value for ums_member_level.free_freight_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.comment_growth_point
     *
     * @return the value of ums_member_level.comment_growth_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.comment_growth_point
     *
     * @param commentGrowthPoint the value for ums_member_level.comment_growth_point
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_free_freight
     *
     * @return the value of ums_member_level.priviledge_free_freight
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_free_freight
     *
     * @param priviledgeFreeFreight the value for ums_member_level.priviledge_free_freight
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_sign_in
     *
     * @return the value of ums_member_level.priviledge_sign_in
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_sign_in
     *
     * @param priviledgeSignIn the value for ums_member_level.priviledge_sign_in
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_comment
     *
     * @return the value of ums_member_level.priviledge_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_comment
     *
     * @param priviledgeComment the value for ums_member_level.priviledge_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_promotion
     *
     * @return the value of ums_member_level.priviledge_promotion
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_promotion
     *
     * @param priviledgePromotion the value for ums_member_level.priviledge_promotion
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_member_price
     *
     * @return the value of ums_member_level.priviledge_member_price
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_member_price
     *
     * @param priviledgeMemberPrice the value for ums_member_level.priviledge_member_price
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_birthday
     *
     * @return the value of ums_member_level.priviledge_birthday
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_birthday
     *
     * @param priviledgeBirthday the value for ums_member_level.priviledge_birthday
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.note
     *
     * @return the value of ums_member_level.note
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.note
     *
     * @param note the value for ums_member_level.note
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
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
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}