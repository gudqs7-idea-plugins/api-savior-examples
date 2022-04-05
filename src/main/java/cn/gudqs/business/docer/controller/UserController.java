package cn.gudqs.business.docer.controller;

import cn.gudqs.business.docer.dto.request.ListUserRequest;
import cn.gudqs.business.docer.dto.response.BaseResponse;
import cn.gudqs.business.docer.dto.response.UserResponse;
import cn.gudqs.business.docer.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户接口
 * #module 用户模块1
 *
 * @author wq
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    /**
     * 查询用户信息(分页)
     * #ActionName DescribeUsers
     *
     * @param listUserPage 过滤条件
     * @return 用户列表数据-分页
     */
    @PostMapping("/listUser")
    public BaseResponse<List<UserResponse>> listUserPage(ListUserRequest listUserPage) {
        // todo 查询分页数据
        log.info("listUserPage--> " + listUserPage);

        return BaseResponse.success(new ArrayList<>(), 0L);
    }


    /**
     * 新增一个用户
     *
     * @param userEntity 用户信息
     * @return 操作是否成功
     * #code 1 用户名已存在 建议换个用户名再试
     * #code 2 手机号已存在 同上
     * #hiddenRequest userId,lastLoginTime
     * #hiddenResponse totalCount
     */
    @PostMapping("/addUser")
    public BaseResponse<Boolean> addUser(@RequestBody UserEntity userEntity) {
        // todo 新增用户
        log.info("addUser--> " + userEntity);

        return BaseResponse.success(true);
    }


    /**
     * 修改用户信息
     *
     * @param userEntity 用户信息
     * @return 操作是否成功
     * #hiddenRequest lastLoginTime,userGender,userAge
     * #hiddenResponse totalCount
     */
    @PostMapping("/updateUser")
    public BaseResponse<Boolean> updateUser(@RequestBody UserEntity userEntity) {
        // todo 修改用户信息
        log.info("updateUser--> " + userEntity);

        return BaseResponse.success(true);
    }

}