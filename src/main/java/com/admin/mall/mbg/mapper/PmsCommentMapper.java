package com.admin.mall.mbg.mapper;

import com.admin.mall.mbg.model.PmsComment;
import com.admin.mall.mbg.model.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int countByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int deleteByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int insert(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int insertSelective(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    List<PmsComment> selectByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    PmsComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByPrimaryKeySelective(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated Sat Dec 19 17:57:08 CST 2020
     */
    int updateByPrimaryKey(PmsComment record);
}