package cn.gudqs.example.docer.restful.user.dto.request;

import lombok.Data;

/**
 * @author gudqs7
 * @date 2022/5/9
 */
@Data
public class CreateUserRequest {

    /**
     * 用户昵称
     * #required
     * #notes 用户昵称需唯一
     */
    private String userNickName;

    /**
     * 用户姓名
     * #required
     */
    private String userRealName;

    /**
     * 用户性别
     * 0:保密
     * 1:男
     * 2:女
     * #required
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
     */
    private String userPhone;

    /**
     * 联系方式-电子邮箱
     */
    private String userEmail;

    /**
     * 用户头像 url 地址
     */
    private String userAvatar;

}
