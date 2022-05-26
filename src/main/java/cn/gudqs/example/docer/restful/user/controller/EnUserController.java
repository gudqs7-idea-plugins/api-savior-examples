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
 * user interface
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/user")
public class EnUserController {


    /**
     * Query user list with pagination
     *
     * @param queryUserRequest Query condition + pagination
     * @return User paginated list
     */
    @PostMapping("/queryUsers")
    public BaseResponse<List<UserResponse>> queryUsers(QueryUserRequest queryUserRequest) {
        /*
        Right-click on the method name to generate cURL, and the results are as follows:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20' --data-urlencode 'searchKeyword=模糊搜索词23' --data-urlencode 'gender=2' --data-urlencode 'ageStart=51' --data-urlencode 'ageEnd=40' --data-urlencode 'registerTimeStart=2022-05-09' --data-urlencode 'registerTimeEnd=2022-05-09'

        Right-click on the method name to generate a pure version of cURL (that is, if the required parameters are not marked, it will not be generated). The results are as follows:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20'

        As a reminder, cURL can be imported directly into Postman, press Ctrl + o in Postman, select Raw Text, paste, and click the orange button twice to confirm.
         */
        return BaseResponse.success();
    }


    /**
     * add a user
     *
     * @param createUserRequest User Info
     * @return Whether the operation was successful
     * #hiddenResponse totalCount
     * #code 10001 User nickname already exists
     * #code 10002 User age range is invalid | User age must be a number between 0 and 200
     */
    @PostMapping("/createUser")
    public BaseResponse<Boolean> createUser(CreateUserRequest createUserRequest) {
        return BaseResponse.success();
    }

    /**
     * update a user
     *
     * @param updateUserRequest User Info
     * @return Whether the operation was successful
     * #hiddenResponse totalCount
     * #code 10002 User age range is invalid | User age must be a number between 0 and 200
     */
    @PostMapping("/updateUser")
    public BaseResponse<Boolean> updateUser(UpdateUserRequest updateUserRequest) {
        return BaseResponse.success();
    }

    /**
     * delete a user
     *
     * @param userId User ID required example=1
     * @return Whether the operation was successful
     * #hiddenResponse totalCount
     * #code 10003 User information does not exist
     */
    @PostMapping("/deleteUser")
    public BaseResponse<Boolean> deleteUser(Long userId) {
        return BaseResponse.success();
    }

}
