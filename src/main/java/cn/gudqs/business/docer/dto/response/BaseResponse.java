package cn.gudqs.business.docer.dto.response;

import lombok.Data;

import java.util.Map;

/**
 * 统一返回类
 * @author wq
 */
@Data
public class BaseResponse<T> {

    /**
     * 状态码
     * 0: 代表成功
     * -1: 代表未知异常
     * >0: 代表已知异常
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 是否成功
     * true: 代表成功, 此时 code = 0
     * false: 代表失败, 此时 code != 0
     * #example true
     * #mock-val @pick([true, false])
     */
    private Boolean success;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 分页-总条数
     */
    private Long totalCount;

    private Map<String, Object> otherMap;

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