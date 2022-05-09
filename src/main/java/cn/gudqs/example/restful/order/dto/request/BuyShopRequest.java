package cn.gudqs.example.restful.order.dto.request;

import lombok.Data;

import java.util.List;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class BuyShopRequest {

    /**
     * 用户ID
     * #required
     * #example 1
     */
    private Long userId;

    /**
     * 关联地址ID
     * #example 1
     */
    private Long addressId;

    /**
     * 购买商品列表
     */
    private List<ShopItem> shopItemList;

    @Data
    public static class ShopItem {

        /**
         * 购买商品ID
         */
        private Long shopId;

        /**
         * 购买数量
         */
        private Integer buyCount;

    }

}
