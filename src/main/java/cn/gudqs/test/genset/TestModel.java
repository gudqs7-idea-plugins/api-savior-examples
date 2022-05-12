package cn.gudqs.test.genset;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wenquan
 * @date 2022/5/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestModel<T> {

    /**
     * 测试普通Pojo
     */
    private TestBaseType testCustomClass;

    /**
     * 测试接口
     */
    private TestService testService;

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
