package com.mycollab.common.dao;

import com.mycollab.common.domain.NotificationItem;
import com.mycollab.common.domain.NotificationItemExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface NotificationItemMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    long countByExample(NotificationItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int deleteByExample(NotificationItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int insert(NotificationItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int insertSelective(NotificationItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    List<NotificationItem> selectByExample(NotificationItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    NotificationItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByExampleSelective(@Param("record") NotificationItem record, @Param("example") NotificationItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByExample(@Param("record") NotificationItem record, @Param("example") NotificationItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByPrimaryKeySelective(NotificationItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByPrimaryKey(NotificationItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    Integer insertAndReturnKey(NotificationItem value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_notification_item
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    void massUpdateWithSession(@Param("record") NotificationItem record, @Param("primaryKeys") List primaryKeys);
}