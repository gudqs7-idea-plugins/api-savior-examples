package cn.gudqs.example.restful.base;

import lombok.Data;

/**
 * 统一分页类
 *
 * @author gudqs7
 */
@Data
public class BasePageRequest {

    /**
     * 分页-当前页码
     * #example 1
     * #required
     */
    private Integer pageNumber;

    /**
     * 分页-分页大小
     * #example 20
     * #required
     */
    private Integer pageSize;

}