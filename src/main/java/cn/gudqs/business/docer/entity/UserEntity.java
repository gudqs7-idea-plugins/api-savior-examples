package cn.gudqs.business.docer.entity;

import lombok.Data;

/**
 * @author WQ
 * @date 2021/9/12
 */
@Data
public class UserEntity {

    /**
     * 用户ID
     */
    private Integer userId;

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
     */
    private String phoneNumber;

    /**
     * 用户性别
     * 0:保密
     * 1:男
     * 2:女
     */
    private String userGender;

    /**
     * 用户年龄
     */
    private String userAge;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 上次登录时间
     */
    private String lastLoginTime;

}
