package cn.gudqs.example.docer.rpc.stock.dto.request;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/10
 */
@Data
public class QueryStockRequest {

    /**
     * 商品ID
     */
    private Long shopId;

    /**
     * 地址信息ID
     */
    private Long addressId;

}
