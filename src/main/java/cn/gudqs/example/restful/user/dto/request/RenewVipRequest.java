package cn.gudqs.example.restful.user.dto.request;

/**
 * @author wenquan
 * @date 2022/5/9
 */
public class RenewVipRequest {

    /**
     * 用户ID
     * #required
     * #example 1
     */
    private Long userId;

    /**
     * VIP 续费时长(单位:月)
     * #required
     * #example 1
     */
    private Integer openingTime;

}
