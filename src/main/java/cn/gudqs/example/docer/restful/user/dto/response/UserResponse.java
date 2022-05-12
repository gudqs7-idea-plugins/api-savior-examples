package cn.gudqs.example.docer.restful.user.dto.response;

import lombok.Data;

/**
 * 用户信息
 *
 * @author gudqs7
 */
@Data
public class UserResponse {

    /**
     * 用户ID-主键
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 用户姓名
     */
    private String userRealName;

    /**
     * 用户性别
     * 0:保密
     * 1:男
     * 2:女
     * #example 2
     */
    private Integer userGender;

    /**
     * 用户年龄
     * #example 18
     */
    private Integer userAge;

    /**
     * 联系方式-手机号
     * #example 13123339966
     */
    private String userPhone;

    /**
     * 联系方式-电子邮箱
     * #example 2333@163.com
     */
    private String userEmail;

    /**
     * 用户头像 url 地址
     * #example https://img.xxx.com/xxxxxxx
     */
    private String userAvatar;

}