package cn.gudqs.example.restful.base;

import lombok.Data;

/**
 * 统一返回类
 *
 * @author gudqs7
 */
@Data
public class BaseResponse<T> {

    /**
     * 请求是否成功
     * #example true
     */
    private Boolean success;

    /**
     * 状态码
     * 200: 代表成功
     * 其它代表异常
     * #example 200
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 分页-总条数
     */
    private Long totalCount;

    public static <T> BaseResponse<T> success() {
        return success(null);
    }

    public static <T> BaseResponse<T> success(T data) {
        return success(data, 0L);
    }

    /**
     * 返回一个成功的 BaseResponse
     * @param data 携带的数据
     * @param totalCount 分页-总条数
     * @return BaseResponse
     */
    public static <T> BaseResponse<T> success(T data, Long totalCount) {
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setSuccess(true);
        baseResponse.setCode(0);
        baseResponse.setMessage("success");
        baseResponse.setData(data);
        baseResponse.setTotalCount(totalCount);
        return baseResponse;
    }

}