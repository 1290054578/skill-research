package com.lonewolf.api.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lonewolf.service.model.MsFansDO;
import com.lonewolf.service.service.IMsFansService;
import com.lonewolf.service.vo.MsFansVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 会员板块-普通用户对应平台信息表（粉丝） 前端控制器
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-08-05
 */
@RestController
@RequestMapping("/ms-fans/action")
public class MsFansController {

    /**
     * 粉丝服务类
     */
    @Autowired
    IMsFansService iMsFansService;

    /**
     * [查询粉丝信息]
     * @author xiangyong.zeng
     * @param msFansVO
     * @return void
     * @date 2019-08-05 15:28
     */
    @ApiOperation(value = "分页查询粉丝信息",notes = "分页查询会员粉丝信息s")
    @PostMapping("query")
    public IPage<MsFansDO> listFansInfo(@Valid @ModelAttribute MsFansVO msFansVO){
        return iMsFansService.listPageFansInfo(msFansVO);
    }

}

