package com.lonewolf.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员板块-普通用户对应平台信息表（粉丝）
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-08-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ms_fans")
public class MsFans implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 与平台、渠道做联合唯一
     */
    private String openid;

    /**
     * 可能空 
     */
    private String unionid;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 平台（ 数据字典）
     */
    private Integer platform;

    /**
     * 所在渠道（ 数据字典）
     */
    private Integer channel;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 自建平台UUID (商城、会员中心等)
     */
    private String oneselfUuid;

    /**
     * UUID会员表ID，注册后更新 CRM唯一标识
     */
    private String uuid;

    /**
     * 成为粉丝时间
     */
    private Integer fannedAt;

    /**
     * 脱粉时间
     */
    private Integer canceledAt;

    /**
     * 会员绑定状态 0.未绑定 1. 已绑定 2.已解绑
     */
    private Integer bindType;

    /**
     * 追踪码 营销推送等场景使用
     */
    private String trackerCode;

    /**
     * CRM首次同步时间
     */
    private Integer createdAt;

    /**
     * CRM更新时间
     */
    private Integer updatedAt;

    /**
     * CDC粉丝唯一身份ID
     */
    private String fansUuid;


}
