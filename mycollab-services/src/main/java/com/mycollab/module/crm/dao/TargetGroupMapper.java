package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.TargetGroup;
import com.mycollab.module.crm.domain.TargetGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface TargetGroupMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    long countByExample(TargetGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    int deleteByExample(TargetGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    @Delete({
        "delete from m_crm_target_list",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    @Insert({
        "insert into m_crm_target_list (id, name, ",
        "type, description, ",
        "createdTime, createdUser, ",
        "sAccountId, assignUser, ",
        "lastUpdatedTime)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{createdtime,jdbcType=TIMESTAMP}, #{createduser,jdbcType=VARCHAR}, ",
        "#{saccountid,jdbcType=INTEGER}, #{assignuser,jdbcType=VARCHAR}, ",
        "#{lastupdatedtime,jdbcType=TIMESTAMP})"
    })
    int insert(TargetGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    int insertSelective(TargetGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    List<TargetGroup> selectByExample(TargetGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    @Select({
        "select",
        "id, name, type, description, createdTime, createdUser, sAccountId, assignUser, ",
        "lastUpdatedTime",
        "from m_crm_target_list",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.TargetGroupMapper.BaseResultMap")
    TargetGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    int updateByExampleSelective(@Param("record") TargetGroup record, @Param("example") TargetGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    int updateByExample(@Param("record") TargetGroup record, @Param("example") TargetGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    int updateByPrimaryKeySelective(TargetGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    @Update({
        "update m_crm_target_list",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "assignUser = #{assignuser,jdbcType=VARCHAR},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TargetGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    Integer insertAndReturnKey(TargetGroup value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target_list
     *
     * @mbg.generated Fri Dec 01 20:52:16 ICT 2017
     */
    void massUpdateWithSession(@Param("record") TargetGroup record, @Param("primaryKeys") List primaryKeys);
}