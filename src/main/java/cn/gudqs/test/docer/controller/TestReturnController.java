package cn.gudqs.test.docer.controller;

import cn.gudqs.test.docer.dto.TestBasePojo;
import cn.gudqs.test.docer.dto.TestGenericPojo;
import cn.gudqs.test.docer.dto.TestPojo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试接口(测响应)
 *
 * @author gudqs7
 */
@RestController
@RequestMapping("/api/v1/test/param")
public class TestReturnController {

    /**
     * 测试无响应
     */
    @PostMapping("/testNoReturn")
    public void testNoReturn() {

    }

    /**
     * 测试单个响应(基本类型)
     *
     * @return 用户ID
     */
    @PostMapping("/testSingleBaseReturn")
    public int testSingleBaseReturn() {
        return 0;
    }

    /**
     * 测试单个响应(集合类型)
     *
     * @return 用户ID列表
     */
    @RequestMapping("/testSingleCollectionReturn")
    public List<String> testSingleCollectionReturn() {
        return null;
    }

    /**
     * 测试单个响应(基本类型组成的Pojo)
     *
     * @return 基本类型组成的Pojo
     */
    @PostMapping("/testSingleBasePojoReturn")
    public TestBasePojo testSingleBasePojoReturn() {
        return null;
    }

    /**
     * 测试单个响应(普通Pojo)
     *
     * @return pojo
     */
    @PostMapping("/testSinglePojoReturn")
    public TestPojo testSinglePojoReturn() {
        return null;
    }

    /**
     * 测试单个响应(带泛型的Pojo)
     *
     * @return pojo
     */
    @PostMapping("/testSingleGenericPojoReturn")
    public TestGenericPojo<TestBasePojo> testSingleGenericPojoReturn() {
        return null;
    }

    /**
     * 测试单个响应(集合类型+泛型)
     *
     * @return pojo列表
     */
    @RequestMapping("/testSingleCollectionAndGenericPojoReturn")
    public List<TestGenericPojo<TestBasePojo>> testSingleCollectionAndGenericPojoReturn() {
        return null;
    }


}
