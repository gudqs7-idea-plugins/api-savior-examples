package cn.gudqs.example.rpc.stock.dto.response;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/10
 */
@Data
public class StockResponse {

    /**
     * 是否有库存
     */
    private Boolean hasStock;

    /**
     * 库存数量
     */
    private Long stockNum;

}
