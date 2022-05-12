package cn.gudqs.test.docer.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wenquan
 * @date 2022/5/12
 */
public class TestPojo {

    /**
     * 测试普通Pojo
     */
    private TestBasePojo testCustomClass;

    /**
     * 测试普通list
     */
    private List list;

    /**
     * 测试字符串list
     */
    private List<String> stringList;

    /**
     * 测试普通set
     */
    private Set set;

    /**
     * 测试字符串set
     */
    private Set<String> stringSet;

    /**
     * 测试普通Map
     */
    private Map map;

    /**
     * 测试对象Map
     */
    private Map<String, Object> objMap;

}
