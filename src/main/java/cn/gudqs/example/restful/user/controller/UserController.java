package cn.gudqs.example.restful.user.controller;

import cn.gudqs.example.base.BaseResponse;
import cn.gudqs.example.restful.user.dto.request.CreateUserRequest;
import cn.gudqs.example.restful.user.dto.request.QueryUserRequest;
import cn.gudqs.example.restful.user.dto.request.UpdateUserRequest;
import cn.gudqs.example.restful.user.dto.response.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户接口
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    /**
     * 查询用户列表(分页)
     *
     * @param queryUserRequest 查询条件+分页
     * @return 用户分页列表
     */
    @PostMapping("/queryUsers")
    public BaseResponse<List<UserResponse>> queryUsers(QueryUserRequest queryUserRequest) {
        return BaseResponse.success();
    }


    /**
     * 新增一个用户
     *
     * @param createUserRequest 用户信息
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10001 用户昵称已存在
     * #code 10002 用户年龄范围无效 用户年龄需在0~200之间的数字
     */
    @PostMapping("/createUser")
    public BaseResponse<Boolean> createUser(CreateUserRequest createUserRequest) {
        return BaseResponse.success();
    }

    /**
     * 更新一个用户
     *
     * @param updateUserRequest 用户信息
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10002 用户年龄范围无效 用户年龄需在0~200之间的数字
     */
    @PostMapping("/updateUser")
    public BaseResponse<Boolean> updateUser(UpdateUserRequest updateUserRequest) {
        return BaseResponse.success();
    }

    /**
     * 删除一个用户
     *
     * @param userId 用户ID required example=1
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10003 用户信息不存在
     */
    @PostMapping("/deleteUser")
    public BaseResponse<Boolean> deleteUser(Long userId) {
        return BaseResponse.success();
    }

}
