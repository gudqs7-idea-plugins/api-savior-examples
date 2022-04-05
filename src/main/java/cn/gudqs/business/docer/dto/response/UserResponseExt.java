package cn.gudqs.business.docer.dto.response;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户信息2
 *
 * @author wq
 */
@Data
public class UserResponseExt {

    /**
     * 图书-账户名
     */
    private String bookAccountName;

    /**
     * 上次借阅时间
     */
    private Date lastReadTime;

    /**
     * 余额
     */
    private Double bookBalance;

    /**
     * 收藏
     */
    private List<String> loveTagList;

    /**
     * 测试 map
     */
    private Map<String, Object> otherMap;

    /**
     * 测试 list
     */
    private List<Object> objectList;

}