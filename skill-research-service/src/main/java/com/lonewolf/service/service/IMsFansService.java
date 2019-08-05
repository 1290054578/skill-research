package com.lonewolf.service.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lonewolf.service.entity.MsFans;
import com.lonewolf.service.model.MsFansDO;
import com.lonewolf.service.vo.MsFansVO;

/**
 * <p>
 * 会员板块-普通用户对应平台信息表（粉丝） 服务类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-08-05
 */
public interface IMsFansService extends IService<MsFans> {

    /**
     * [分页查询粉丝信息]
     * @author xiangyong.zeng
     * @param msFansVO
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.lonewolf.service.model.MsFansDO>
     * @date 2019-08-05 15:36
     */
    IPage<MsFansDO> listPageFansInfo(MsFansVO msFansVO);
}
