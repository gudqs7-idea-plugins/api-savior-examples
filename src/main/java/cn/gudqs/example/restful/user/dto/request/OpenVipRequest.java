package cn.gudqs.example.restful.user.dto.request;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class OpenVipRequest {

    /**
     * 用户ID
     * #required
     * #example 1
     */
    private Long userId;

    /**
     * VIP类型
     * 1:青铜
     * 2:白银
     * 3:黄金
     * #required
     * #example 3
     */
    private Integer vipType;

    /**
     * VIP 开通时长(单位:月)
     * #required
     * #example 1
     */
    private Integer openingTime;

}
