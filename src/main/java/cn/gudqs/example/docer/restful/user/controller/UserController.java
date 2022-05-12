package cn.gudqs.example.docer.restful.user.controller;

import cn.gudqs.example.docer.base.BaseResponse;
import cn.gudqs.example.docer.restful.user.dto.request.CreateUserRequest;
import cn.gudqs.example.docer.restful.user.dto.request.QueryUserRequest;
import cn.gudqs.example.docer.restful.user.dto.request.UpdateUserRequest;
import cn.gudqs.example.docer.restful.user.dto.response.UserResponse;
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
        /*
        方法名上右键, 生成 cURL, 结果如下:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20' --data-urlencode 'searchKeyword=模糊搜索词23' --data-urlencode 'gender=2' --data-urlencode 'ageStart=51' --data-urlencode 'ageEnd=40' --data-urlencode 'registerTimeStart=2022-05-09' --data-urlencode 'registerTimeEnd=2022-05-09'
        方法名上右键, 生成 cURL纯净版(即未标记必填的参数, 不生成), 结果如下:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20'

        提一句, cURL 可直接导入到 Postman, 在 Postman 按 Ctrl + o, 选择 Raw Text, 粘贴, 点两次橙色按钮确定即可.
         */
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
