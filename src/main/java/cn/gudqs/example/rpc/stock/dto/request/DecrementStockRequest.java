package cn.gudqs.example.rpc.stock.dto.request;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/10
 */
@Data
public class DecrementStockRequest {

    /**
     * 商品ID
     */
    private Long shopId;

    /**
     * 地址信息ID
     */
    private Long addressId;

    /**
     * 扣减的库存数量
     */
    private Long stockNum;

}
