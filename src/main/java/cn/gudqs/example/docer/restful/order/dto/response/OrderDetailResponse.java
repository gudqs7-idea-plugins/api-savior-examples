package cn.gudqs.example.docer.restful.order.dto.response;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class OrderDetailResponse {

    /**
     * 商品ID
     */
    private Long shopId;

    /**
     * 购买数量
     */
    private Integer buyNum;

    /**
     * 商品名称
     */
    private String shopName;

    /**
     * 商品价格
     */
    private String shopPrice;

    /**
     * 商品图片URL
     * #example https://img.xxx.com/xxxxxxxxxxx
     */
    private String shopImgUrl;

}
