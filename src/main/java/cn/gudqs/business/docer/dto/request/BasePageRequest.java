package cn.gudqs.business.docer.dto.request;

import lombok.Data;

/**
 * @author wq
 */
@Data
public class BasePageRequest {

    /**
     * 分页-当前页码
     * #example 1
     */
    private Integer pageNumber;

    /**
     * 分页-分页大小
     * #example 20
     */
    private Integer pageSize;

}