package cn.gudqs.example.docer.restful.user.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
public class VipUserResponse {

    /**
     * 用户ID-主键
     */
    private Long userId;

    /**
     * VIP 类型
     * 1:青铜
     * 2:白银
     * 3:黄金
     * #example 3
     */
    private Integer vipType;

    /**
     * VIP 过期时间
     */
    private Date vipExpireTime;

    /**
     * VIP 首次开通时间
     */
    private Date vipFirstOpenTime;

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
