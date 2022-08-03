package cn.gudqs.test.docer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试错误接口
 * #hidden
 * @author wq
 */
@RestController
@RequestMapping("/test/error")
public class TestErrorController {

    /**
     * 测试示例值类型转换失败
     *
     * @param deleted 删除 example=false
     * @param age     年龄 example=一百
     */
    @RequestMapping("/testErrorExample")
    public void testErrorExample(Boolean deleted, Integer age) {

    }

}
