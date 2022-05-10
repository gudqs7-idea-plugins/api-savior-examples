package cn.gudqs.example.restful.user.dto.request;

import cn.gudqs.example.base.BasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryVipUserRequest extends BasePageRequest {

    /**
     * 模糊搜索词
     * 支持用户昵称, 用户姓名, 用户手机号
     */
    private String searchKeyword;

    /**
     * 用户性别
     * 0: 保密
     * 1: 男
     * 2: 女
     * #example 2
     */
    private Integer gender;

    /**
     * VIP 类型
     * 1:青铜
     * 2:白银
     * 3:黄金
     * #example 3
     */
    private Integer vipType;

    /**
     * VIP开通时间范围-开始
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private String firstOpenTimeStart;

    /**
     * VIP开通时间范围-结束
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private Date firstOpenTimeEnd;

    /**
     * VIP过期时间范围-开始
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private String vipExpireTimeStart;

    /**
     * VIP过期时间范围-结束
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private Date vipExpireTimeEnd;

}
