package cn.gudqs.business.docer.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 查询用户-过滤条件
 *
 * @author wq
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListUserRequest extends BasePageRequest {

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
     * 过滤年龄范围-起始
     */
    private Integer ageStart;

    /**
     * 过滤年龄范围-结束
     */
    private Integer ageEnd;

    /**
     * 过滤登录时间范围-开始
     */
    private Date loginTimeStart;

    /**
     * 过滤登录时间范围-结束
     */
    private Date loginTimeEnd;

}