package cn.gudqs.example.rpc.logistics.service;

import cn.gudqs.example.base.BaseResponse;
import cn.gudqs.example.rpc.logistics.dto.request.QueryLogisticsRequest;
import cn.gudqs.example.rpc.logistics.dto.response.LogisticsResponse;

/**
 * 物流查询接口
 * @author wenquan
 * @date 2022/5/10
 * #module 物流模块
 */
public interface LogisticsService {

    /**
     * 根据快递单号查询物流轨迹
     *
     * @param queryLogisticsRequest 快递类型+快递单号
     * @return 物流轨迹
     * #hiddenResponse totalCount
     */
    BaseResponse<LogisticsResponse> queryLogistics(QueryLogisticsRequest queryLogisticsRequest);

}
