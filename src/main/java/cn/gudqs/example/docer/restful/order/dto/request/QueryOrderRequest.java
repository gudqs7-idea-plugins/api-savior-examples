package cn.gudqs.example.docer.restful.order.dto.request;

import cn.gudqs.example.docer.base.BasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryOrderRequest extends BasePageRequest {

    /**
     * 订单编号
     * #example 2022050925939
     */
    private String orderNo;

    /**
     * 用户ID
     * #example 1
     */
    private Long userId;

    /**
     * 订单类型
     * 1:购买会员订单
     * 2:购买商品订单
     * #example 2
     */
    private Integer orderType;

    /**
     * 订单状态
     * 0:待处理
     * 1:已支付
     * 2:已取消
     * 3:已退款
     * #example 0
     */
    private Integer orderStatus;

    /**
     * 下单时间范围-开始
     * 格式: 2022-05-09
     * #example 2020-05-09
     */
    private String orderTimeStart;

    /**
     * 下单时间范围-结束
     * 格式: 2022-05-09
     * #example 2020-05-09
     */
    private String orderTimeEnd;

}
