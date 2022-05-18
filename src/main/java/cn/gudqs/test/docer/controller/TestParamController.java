package cn.gudqs.test.docer.controller;

import cn.gudqs.test.docer.dto.TestBasePojo;
import cn.gudqs.test.docer.dto.TestGenericPojo;
import cn.gudqs.test.docer.dto.TestPojo;
import cn.gudqs.test.docer.dto.TestSqlTypePojo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 测试接口(测参数)
 *
 * @author gudqs7
 */
@RestController
@RequestMapping("/api/v1/test/param")
public class TestParamController {

    /**
     * 测试无参数
     */
    @PostMapping("/testNoParam")
    public void testNoParam() {

    }

    /**
     * 测试单个参数(基本类型)
     *
     * @param userId 用户id required example=30
     */
    @PostMapping("/testSingleBaseParam")
    public void testSingleBaseParam(int userId) {

    }

    /**
     * 测试单个参数(集合类型)
     *
     * @param userIdList 用户ID列表
     */
    @RequestMapping("/testSingleCollectionParam")
    public void testSingleCollectionParam(List<String> userIdList) {
        // SpringMVC 并不支持以上语法
    }

    /**
     * 测试单个参数(基本类型组成的Pojo)
     *
     * @param testBasePojo 基本类型组成的Pojo
     */
    @PostMapping("/testSingleBasePojoParam")
    public void testSingleBasePojoParam(TestBasePojo testBasePojo) {

    }

    /**
     * 测试单个参数(sql类型组成的Pojo)
     *
     * @param testSqlTypePojo sql类型组成的Pojo
     */
    @PostMapping("/testSingleSqlTypePojoParam")
    public void testSingleSqlTypePojoParam(TestSqlTypePojo testSqlTypePojo) {

    }

    /**
     * 测试单个参数(普通Pojo)
     *
     * @param testPojo pojo
     */
    @PostMapping("/testSinglePojoParam")
    public void testSinglePojoParam(TestPojo testPojo) {

    }

    /**
     * 测试单个参数(带泛型的Pojo)
     *
     * @param testGenericPojo pojo
     */
    @PostMapping("/testSingleGenericPojoParam")
    public void testSingleGenericPojoParam(TestGenericPojo<TestBasePojo> testGenericPojo) {

    }

    /**
     * 测试单个参数(文件类型)
     *
     * @param file 文件 example=${desktop}/test.zip
     */
    @PostMapping("/testSingleFileParam")
    public void testSingleFileParam(MultipartFile file) {

    }

    /**
     * 测试多参数(基本类型)
     *
     * @param userId   用户ID required
     * @param userAge  用户年龄 notes=不能为负数
     * @param amount   用户金额
     * @param userName 用户姓名 example=gudqs7
     */
    @PostMapping("/testMultiBaseParam")
    public void testMultiBaseParam(long userId, int userAge, float amount, String userName) {

    }

    /**
     * 测试多参数(集合类型)
     *
     * @param userIdList   用户ID列表
     * @param userAgeList  用户年龄列表
     * @param userNameList 用户姓名列表
     */
    @PostMapping("/testMultiCollectionParam")
    public void testMultiCollectionParam(List<Long> userIdList, List<Integer> userAgeList, List<String> userNameList) {

    }

    /**
     * 测试多参数(Pojo)
     *
     * @param testBasePojo    base pojo
     * @param testPojo        pojo
     * @param testGenericPojo 泛型pojo
     */
    @PostMapping("/testMultiPojoParam")
    public void testMultiPojoParam(TestBasePojo testBasePojo, TestPojo testPojo, TestGenericPojo<TestBasePojo> testGenericPojo) {

    }

    /**
     * 测试多个参数(文件类型)
     *
     * @param file         文件1 example=${project}/a.txt required
     * @param file2        文件2 example=${download}/a.txt
     * @param testBasePojo pojo
     */
    @PostMapping("/testMultiFileParam")
    public void testMultiFileParam(MultipartFile file, MultipartFile file2, TestBasePojo testBasePojo) {

    }

}
