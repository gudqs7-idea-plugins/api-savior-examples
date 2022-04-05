package cn.gudqs.business.docer.service;

import cn.gudqs.business.docer.dto.response.BaseResponse;
import cn.gudqs.business.docer.dto.response.UserResponse;

import java.util.Date;
import java.util.List;

public interface UserService {

    void testVoid();

    /**
     * 测试单个参数
     * @param name 名称
     */
    void testSingleParam(String name);

    /**
     * 测试多个参数
     * @param name 名称 required
     * @param age 年龄 required
     * @param amount 金额 example=32.3
     * @param num 数字
     * @param start 起始时间
     * @param flag 标识
     */
    void testMultiParam(String name, Integer age, Double amount, Float num, Date start, Boolean flag);

    /**
     * 测试普通返回值
     * @return 字符串
     */
    String testNoParam();

    /**
     * 测试泛型参数-基础
     * @return 数据
     */
    BaseResponse<String> testObjParamBase();

    /**
     * 测试泛型参数-普通类
     * @return 数据
     */
    BaseResponse<UserResponse> testObjParamPojo();

    /**
     * 测试泛型参数-普通类集合
     * @return 数据
     */
    BaseResponse<List<UserResponse>> testObjParamPojoList();

}
