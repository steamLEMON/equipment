package cn.newness.imip.module.system.service.logger;

import cn.newness.imip.framework.common.pojo.PageResult;
import cn.newness.imip.module.system.api.logger.dto.LoginLogCreateReqDTO;
import cn.newness.imip.module.system.controller.admin.logger.vo.loginlog.LoginLogPageReqVO;
import cn.newness.imip.module.system.dal.dataobject.logger.LoginLogDO;

import jakarta.validation.Valid;

/**
 * 登录日志 Service 接口
 */
public interface LoginLogService {

    /**
     * 获得登录日志分页
     *
     * @param pageReqVO 分页条件
     * @return 登录日志分页
     */
    PageResult<LoginLogDO> getLoginLogPage(LoginLogPageReqVO pageReqVO);

    /**
     * 创建登录日志
     *
     * @param reqDTO 日志信息
     */
    void createLoginLog(@Valid LoginLogCreateReqDTO reqDTO);

}
