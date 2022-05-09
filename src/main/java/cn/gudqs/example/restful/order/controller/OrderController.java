package cn.gudqs.example.restful.order.controller;

import cn.gudqs.example.restful.base.BaseResponse;
import cn.gudqs.example.restful.order.dto.request.QueryOrderRequest;
import cn.gudqs.example.restful.order.dto.response.AddressResponse;
import cn.gudqs.example.restful.order.dto.response.OrderDetailResponse;
import cn.gudqs.example.restful.order.dto.response.OrderResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单接口
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    /**
     * 查询订单信息列表(分页)
     *
     * @param queryOrderRequest 查询条件+分页参数
     * @return 订单信息分页列表
     */
    @PostMapping("/queryOrders")
    public BaseResponse<List<OrderResponse>> queryOrders(@RequestBody QueryOrderRequest queryOrderRequest) {
        return BaseResponse.success();
    }

    /**
     * 根据订单ID查询订单明细信息列表
     *
     * @param orderId 订单ID required example=1
     * @return 订单明细信息列表
     * #hiddenResponse totalCount
     */
    @GetMapping("/queryOrderDetails")
    public BaseResponse<List<OrderDetailResponse>> queryOrderDetails(Long orderId) {
        return BaseResponse.success();
    }

    /**
     * 根据地址ID查询地址信息
     *
     * @param addressId 地址ID required example=1
     * @return 地址信息
     * #hiddenResponse totalCount
     */
    @GetMapping("/queryAddressInfo")
    public BaseResponse<AddressResponse> queryAddressInfo(Long addressId) {
        return BaseResponse.success();
    }

}
