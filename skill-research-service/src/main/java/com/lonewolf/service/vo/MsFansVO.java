package com.lonewolf.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-05 15:08
 * @Description:
 */
@Data
public class MsFansVO extends PageData{

    @ApiModelProperty(value = "phone",name = "手机号码")
    private String phone;

    @ApiModelProperty(value = "other",name = "API文档中不可见",hidden = true)
    private String other;
}
