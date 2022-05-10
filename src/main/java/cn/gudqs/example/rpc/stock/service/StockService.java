package cn.gudqs.example.rpc.stock.service;

import cn.gudqs.example.base.BaseResponse;
import cn.gudqs.example.rpc.stock.dto.request.DecrementStockRequest;
import cn.gudqs.example.rpc.stock.dto.request.QueryStockRequest;
import cn.gudqs.example.rpc.stock.dto.response.StockResponse;

/**
 * 库存接口
 *
 * @author wenquan
 * @date 2022/5/10
 * #module 库存模块
 */
public interface StockService {

    /**
     * 查询商品库存情况
     *
     * @param queryStockRequest 商品等信息
     * @return 库存情况
     * #hiddenResponse totalCount
     */
    BaseResponse<StockResponse> queryStock(QueryStockRequest queryStockRequest);

    /**
     * 扣减库存
     *
     * @param decrementStockRequest 商品等信息
     * @return 是否操作成功
     * #hiddenResponse totalCount
     */
    BaseResponse<Boolean> decrementStock(DecrementStockRequest decrementStockRequest);

}
