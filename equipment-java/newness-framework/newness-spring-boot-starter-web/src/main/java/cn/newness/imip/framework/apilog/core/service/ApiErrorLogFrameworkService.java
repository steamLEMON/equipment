package cn.newness.imip.framework.apilog.core.service;

import cn.newness.imip.module.infra.api.logger.dto.ApiErrorLogCreateReqDTO;

/**
 * API 错误日志 Framework Service 接口
 *
 * @author 新奇源码
 */
public interface ApiErrorLogFrameworkService {

    /**
     * 创建 API 错误日志
     *
     * @param reqDTO API 错误日志
     */
    void createApiErrorLog(ApiErrorLogCreateReqDTO reqDTO);

}
