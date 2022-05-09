package cn.gudqs.example.restful.order.dto.response;

import lombok.Data;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class AddressResponse {
    
    /**
     * 国家
     * #example 中国
     */
    private String country;

    /**
     * 省份
     * #example 浙江
     */
    private String province;

    /**
     * 城市
     * #example 杭州
     */
    private String city;

    /**
     * 区域
     * #example 西湖区
     */
    private String area;

    /**
     * 街道
     * #example 留下街道
     */
    private String street;

    /**
     * 详细信息
     * #example 翠苑小区22栋33楼333
     */
    private String detailAddress;

}
