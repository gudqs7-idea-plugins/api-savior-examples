package cn.gudqs.example.docer.rpc.logistics.dto.request;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/10
 */
@Data
public class QueryLogisticsRequest {

    /**
     * 快递类型
     * 1:顺丰
     * 2:EMS
     * 3:申通
     * 4:圆通
     * 5:极兔
     * 6:京东
     * 7:丹鸟
     * 8:韵达
     * #example 1
     */
    private Integer expressType;

    /**
     * 快递单号
     * #example 784283884390280
     */
    private String expressNo;

}
