package cn.gudqs.business.docer.controller;

import cn.gudqs.business.docer.dto.request.ListUserRequest;
import cn.gudqs.business.docer.dto.response.BaseResponse;
import cn.gudqs.business.docer.dto.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 测试接口
 * @author wq
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/user")
public class TestController {


    /**
     * 测试无参数
     * @return 返回数据
     */
    @GetMapping("/testNoParam.json")
    public BaseResponse<String> testNoParam() {
        return BaseResponse.success();
    }

    /**
     * 测试单个参数
     * @param name 名称
     * @return 返回
     */
    @GetMapping("/testSingleParam.json")
    public BaseResponse<String> testSingleParam(String name) {
        return BaseResponse.success();
    }

    /**
     *
     * 测试多个参数
     * @param name 名称 required
     * @param age 年龄 required
     * @param amount 金额 example=32.3
     * @param num 数字
     * @param start 起始时间
     * @param flag 标识
     * @return 返回
     */
    @GetMapping("/testMultiParam.json")
    public BaseResponse<String> testMultiParam(String name, Integer age, Double amount, Float num, Date start, Boolean flag) {
        return BaseResponse.success();
    }

    /**
     * 测试普通对象参数
     * @param listUserRequest 条件
     * @return 返回数据
     */
    @RequestMapping(value = "/testPojoParam.json", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse<String> testPojoParam(ListUserRequest listUserRequest) {
        return BaseResponse.success();
    }

    /**
     * 测试普通参数+置于请求体
     * @param listUserRequest 条件
     * @return 返回数据
     */
    @RequestMapping(value = "/testPojoParamWithBody.json", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse<String> testPojoParamWithBody(@RequestBody ListUserRequest listUserRequest) {
        return BaseResponse.success();
    }

    /**
     * 测试普通对象(置于请求体)+普通参数
     * @param listUserRequest 条件
     * @param uid 用户id
     * @param amount 金额 required example=3.2
     * @return
     */
    @RequestMapping(value = "/testPojoParamWithBody.json", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse<String> testPojoParamWithBody(@RequestBody ListUserRequest listUserRequest, Integer uid, Double amount) {
        return BaseResponse.success();
    }

    /**
     * 测试返回pojo
     * @return pojo
     */
    @RequestMapping(value = "/testReturnPojo.json", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse<UserResponse> testReturnPojo() {
        return BaseResponse.success();
    }

    /**
     * 测试返回pojo集合
     * @return 集合
     */
    @RequestMapping(value = "/testReturnPojoList.json", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse<List<UserResponse>> testReturnPojoList() {
        return BaseResponse.success();
    }

}
