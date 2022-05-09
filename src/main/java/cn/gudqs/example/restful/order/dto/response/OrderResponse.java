package cn.gudqs.example.restful.order.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class OrderResponse {

    /**
     * 订单ID
     * #example 1
     */
    private Long orderId;

    /**
     * 订单编号
     * #example 20220509323432
     */
    private String orderNo;

    /**
     * 用户ID
     * #example 1
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String userNickName;

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
     * 下单时间
     */
    private Date orderTime;

    /**
     * 关联地址ID
     * #example 1
     */
    private Long addressId;

    /**
     * 订单额外信息
     * Json格式
     * #example {"vipType": 1,"vipTiming": 12}
     */
    private String orderExtInfo;

}
