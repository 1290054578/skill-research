package com.lonewolf.service.vo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-05 15:12
 * @Description: 分页公共参数
 */
@Data
public class PageData implements Serializable {

    @Min(value = 0,message = "不能小于0")
    @NotNull(message = "当前页数不能为空")
    private Integer current;

    @Min(value = 0,message = "每页条数不能小于0")
    @NotNull(message = "每页条数不能为空")
    private Integer pageSize;
}
