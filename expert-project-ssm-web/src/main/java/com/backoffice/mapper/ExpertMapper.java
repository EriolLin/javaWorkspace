package com.backoffice.mapper;

import com.backoffice.model.Expert;
import com.backoffice.model.ExpertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    long countByExample(ExpertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int deleteByExample(ExpertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int insert(Expert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int insertSelective(Expert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    List<Expert> selectByExample(ExpertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    Expert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Expert record, @Param("example") ExpertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int updateByExample(@Param("record") Expert record, @Param("example") ExpertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int updateByPrimaryKeySelective(Expert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expert
     *
     * @mbg.generated Tue Mar 19 12:59:51 CST 2019
     */
    int updateByPrimaryKey(Expert record);
}