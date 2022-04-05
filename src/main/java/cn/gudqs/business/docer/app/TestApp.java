package cn.gudqs.business.docer.app;

import java.math.BigDecimal;
import java.util.*;

public class TestApp {

    public static void main(String[] args) {

        // 定义两个对象, 一个接收, 一个获取
        TestUser<TestApp> app = new TestUser<>();
        TestUser<TestApp> rec = new TestUser<>();
        // 先自己写一行, 不必方法准确, 只需确保 rec 和 app 的位置对了即可
        rec.setAmount(app.getAmount0());





        TestUser<Object> testUser = TestUser.builder()
                .amount(0)
                .amount0(0)
                .name("")
                .now(new Date())
                .data(new Object())
                .bigDecimal(new BigDecimal(0))
                .list(new ArrayList<>())
                .map(new HashMap<>())
                .otherUser(new TestUser<Object>())
                .build();


        List<TestUser<TestApp>> userList = new ArrayList<>();
        Map<String, TestUser<TestUser>> map = new HashMap<>();
        for (Map.Entry<String, TestUser<TestUser>> entry : map.entrySet()) {

        }
        for (TestUser<TestApp> testAppTestUser : userList) {
            testAppTestUser.setAmount(0);
            testAppTestUser.setAmount0(0);
            testAppTestUser.setName("");
            testAppTestUser.setNow(new Date());
            testAppTestUser.setData(new TestApp());
            testAppTestUser.setBigDecimal(new BigDecimal(0));
            testAppTestUser.setList(new ArrayList<>());
            testAppTestUser.setMap(new HashMap<>());

        }
    }

    public void test(TestUser<TestApp> app) {

    }

    /**
     * 测试hsf
     * @param age 年龄
     * @param gender 性别
     * @param name 名称
     */
    public void testHsf(Integer age, Integer gender, String name) {

    }

    /**
     * 测试hsf
     * @param age 年龄
     * @return 名称
     */
    public String testHsf(Integer age) {
        return "";
    }

    /**
     * 测试hsf222
     */
    public void testHsf() {
        return;
    }

}
