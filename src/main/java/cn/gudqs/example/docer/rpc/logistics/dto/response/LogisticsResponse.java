package cn.gudqs.example.docer.rpc.logistics.dto.response;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author wenquan
 * @date 2022/5/10
 */
@Data
public class LogisticsResponse {

    /**
     * 物流状态
     * 1:已揽收
     * 2:运输中
     * 3:配送中
     * 4:已签收
     * 5:已拒收
     */
    private Integer logisticsStatus;

    /**
     * 物流轨迹信息列表
     */
    private List<LogisticsDetail> logisticsDetailList;

    @Data
    private static class LogisticsDetail {

        /**
         * 物流流转时间
         */
        private Date detailTime;

        /**
         * 物流流转状态信息
         */
        private String statusText;

        /**
         * 物流流转描述
         */
        private String shippingSituation;

    }

}
