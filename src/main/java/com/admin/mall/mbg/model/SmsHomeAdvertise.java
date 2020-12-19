package com.admin.mall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SmsHomeAdvertise implements Serializable {
    private Long id;

    private String name;

    private Integer type;

    private String pic;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private Integer clickCount;

    private Integer orderCount;

    private String url;

    private String note;

    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_home_advertise
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.id
     *
     * @return the value of sms_home_advertise.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.id
     *
     * @param id the value for sms_home_advertise.id
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.name
     *
     * @return the value of sms_home_advertise.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.name
     *
     * @param name the value for sms_home_advertise.name
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.type
     *
     * @return the value of sms_home_advertise.type
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.type
     *
     * @param type the value for sms_home_advertise.type
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.pic
     *
     * @return the value of sms_home_advertise.pic
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.pic
     *
     * @param pic the value for sms_home_advertise.pic
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.start_time
     *
     * @return the value of sms_home_advertise.start_time
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.start_time
     *
     * @param startTime the value for sms_home_advertise.start_time
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.end_time
     *
     * @return the value of sms_home_advertise.end_time
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.end_time
     *
     * @param endTime the value for sms_home_advertise.end_time
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.status
     *
     * @return the value of sms_home_advertise.status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.status
     *
     * @param status the value for sms_home_advertise.status
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.click_count
     *
     * @return the value of sms_home_advertise.click_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.click_count
     *
     * @param clickCount the value for sms_home_advertise.click_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.order_count
     *
     * @return the value of sms_home_advertise.order_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.order_count
     *
     * @param orderCount the value for sms_home_advertise.order_count
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.url
     *
     * @return the value of sms_home_advertise.url
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.url
     *
     * @param url the value for sms_home_advertise.url
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.note
     *
     * @return the value of sms_home_advertise.note
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.note
     *
     * @param note the value for sms_home_advertise.note
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.sort
     *
     * @return the value of sms_home_advertise.sort
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.sort
     *
     * @param sort the value for sms_home_advertise.sort
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
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
        sb.append(", type=").append(type);
        sb.append(", pic=").append(pic);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", url=").append(url);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}