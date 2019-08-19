package com.lonewolf.service.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lonewolf.service.entity.MsFans;
import com.lonewolf.service.mapper.MsFansMapper;
import com.lonewolf.service.model.MsFansDO;
import com.lonewolf.service.service.IMsFansService;
import com.lonewolf.service.vo.MsFansVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 会员板块-普通用户对应平台信息表（粉丝） 服务实现类
 * </p>
 *
 * @author xiangyong.zeng
 * @since 2019-08-05
 */
@Service
public class MsFansServiceImpl extends ServiceImpl<MsFansMapper, MsFans> implements IMsFansService {

    /**
     * [分页查询粉丝信息]
     * @author xiangyong.zeng
     * @param msFansVO
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.lonewolf.service.model.MsFansDO>
     * @date 2019-08-05 15:36
     */
    @Override
    public IPage<MsFansDO> listPageFansInfo(MsFansVO msFansVO) {
        Page<MsFansVO> page = new Page<>(msFansVO.getCurrent(),msFansVO.getPageSize());
        //不使用mybatis-plus的sql注入进行总数查询，数据量多会很慢
        page.setSearchCount(false);
        IPage iPage = this.baseMapper.listPageFansInfo(page,msFansVO);

        iPage.setTotal(this.baseMapper.countMsFans(msFansVO));

        return iPage;
    }
}
