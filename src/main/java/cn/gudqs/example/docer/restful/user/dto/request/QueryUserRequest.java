package cn.gudqs.example.docer.restful.user.dto.request;

import cn.gudqs.example.docer.base.BasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 查询用户-过滤条件
 *
 * @author gudqs7
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryUserRequest extends BasePageRequest {

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
     * 注册时间范围-开始
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private String registerTimeStart;

    /**
     * 注册时间范围-结束
     * 格式: 2022-05-09
     * #example 2022-05-09
     */
    private Date registerTimeEnd;

}