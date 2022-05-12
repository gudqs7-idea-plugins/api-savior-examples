package cn.gudqs.test.docer.dto;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wenquan
 * @date 2022/5/12
 */
public class TestGenericPojo<T> {

    // ============= 泛型 ============

    /**
     * 测试泛型
     */
    private T data;

    /**
     * 测试泛型集合List
     */
    private List<T> dataList;

    /**
     * 测试泛型集合Set
     */
    private Set<T> dataSet;

    /**
     * 测试泛型集合Collection
     */
    private Collection<T> dataCollection;

    /**
     * 测试带泛型Map
     */
    private Map<String, T> genericMap;

}
