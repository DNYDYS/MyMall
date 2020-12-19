package com.admin.mall.mbg.model;

import java.io.Serializable;

public class SmsHomeRecommendSubject implements Serializable {
    private Long id;

    private Long subjectId;

    private String subjectName;

    private Integer recommendStatus;

    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_home_recommend_subject
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_subject.id
     *
     * @return the value of sms_home_recommend_subject.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_subject.id
     *
     * @param id the value for sms_home_recommend_subject.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_subject.subject_id
     *
     * @return the value of sms_home_recommend_subject.subject_id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_subject.subject_id
     *
     * @param subjectId the value for sms_home_recommend_subject.subject_id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_subject.subject_name
     *
     * @return the value of sms_home_recommend_subject.subject_name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_subject.subject_name
     *
     * @param subjectName the value for sms_home_recommend_subject.subject_name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_subject.recommend_status
     *
     * @return the value of sms_home_recommend_subject.recommend_status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_subject.recommend_status
     *
     * @param recommendStatus the value for sms_home_recommend_subject.recommend_status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_recommend_subject.sort
     *
     * @return the value of sms_home_recommend_subject.sort
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_recommend_subject.sort
     *
     * @param sort the value for sms_home_recommend_subject.sort
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
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
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}