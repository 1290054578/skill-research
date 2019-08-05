package com.lonewolf.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lonewolf.service.entity.MsFans;
import com.lonewolf.service.model.MsFansDO;
import com.lonewolf.service.vo.MsFansVO;

/**
 * <p>
 * 会员板块-普通用户对应平台信息表（粉丝） Mapper 接口
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-08-05
 */
public interface MsFansMapper extends BaseMapper<MsFans> {

    /**
     * [分页查询粉丝信息]
     * @author xiangyong.zeng
     * @param page
     * @param msFansVO
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.lonewolf.service.model.MsFansDO>
     * @date 2019-08-05 15:45
     */
    IPage<MsFansDO> listPageFansInfo(Page page, MsFansVO msFansVO);

    /**
     * [单独查询粉丝总数]
     * @author xiangyong.zeng
     * @param msFansVO
     * @return java.lang.Integer
     * @date 2019-08-05 15:45
     */
    Integer countMsFans(MsFansVO msFansVO);
}
