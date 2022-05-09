package cn.gudqs.example.restful.order.controller;

import cn.gudqs.example.restful.base.BaseResponse;
import cn.gudqs.example.restful.order.dto.request.BuyShopRequest;
import cn.gudqs.example.restful.order.dto.request.BuyVipRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 下单接口
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/pay")
public class PayController {

    /**
     * 购买VIP
     *
     * @param buyVipRequest VIP开通信息
     * @return 订单ID
     * #hiddenResponse totalCount
     */
    @PostMapping("/buyVip")
    public BaseResponse<Long> buyVip(@RequestBody BuyVipRequest buyVipRequest) {
        return BaseResponse.success();
    }

    /**
     * 购买商品
     *
     * @param buyShopRequest 订单信息+商品信息列表
     * @return 订单ID
     * #hiddenResponse totalCount
     */
    @PostMapping("/buyShop")
    public BaseResponse<Long> buyShop(@RequestBody BuyShopRequest buyShopRequest) {
        return BaseResponse.success();
    }

}
