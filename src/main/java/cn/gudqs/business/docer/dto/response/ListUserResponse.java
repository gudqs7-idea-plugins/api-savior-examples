package cn.gudqs.business.docer.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息
 *
 * @author wq
 */
@Data
public class ListUserResponse {

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户姓名
     */
    private String realName;

    /**
     * 用户手机号
     * #example 110
     */
    private String phoneNumber;

    /**
     * 用户性别
     * 0: 保密
     * 1: 男
     * 2: 女
     * #example 2
     */
    private Integer userGender;

    /**
     * 用户年龄
     * #example 1024
     */
    private Integer userAge;

    /**
     * 用户头像地址
     * #example https://mp.weixin.com/p/jewagheiajifejgihewjg.ifew
     */
    private String userAvatar;

    /**
     * 最近一次登录时间
     */
    private Date lastLoginTime;

}