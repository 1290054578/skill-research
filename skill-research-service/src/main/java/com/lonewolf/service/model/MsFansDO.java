package com.lonewolf.service.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-05 15:28
 * @Description:
 */
@Data
public class MsFansDO {

    /**
     * 与平台、渠道做联合唯一
     */
    @ApiModelProperty(value = "openid",name = "openid标志",hidden = true)
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
