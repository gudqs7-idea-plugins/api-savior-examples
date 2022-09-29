package cn.gudqs.test.docer.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author wenquan
 * @date 2022/5/12
 */
@Data
public class TestBasePojo {

    /**
     * test int
     */
    private int testInt;

    /**
     * test long
     */
    private long testLong;

    /**
     * test float
     */
    private float testFloat;

    /**
     * test boolean
     */
    private boolean testBoolean;

    /**
     * test string
     */
    private String testString;

    /**
     * test date
     */
    private Date testDate;

    /**
     * test localDateTime
     */
    private LocalDateTime testLocalDt;

    /**
     * test decimal
     */
    private BigDecimal testDecimal;

    /**
     * test number
     */
    private Number testNumber;

    /**
     * 测试自我循环
     */
    private TestBasePojo testSelfCycle;

    /**
     * 测试循环
     */
    private TestPojo testCycle;


}
