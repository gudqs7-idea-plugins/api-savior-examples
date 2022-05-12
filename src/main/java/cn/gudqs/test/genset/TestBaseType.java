package cn.gudqs.test.genset;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 八大基本类型(带包装)
 * @author wenquan
 * @date 2022/5/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestBaseType {

    // 八大基本类型 byte short int long float double char boolean

    private byte testByte;

    private short testShort;

    private int testInt;

    private long testLong;

    private float testFloat;

    private double testDouble;

    private char testChar;

    private boolean testBoolean;

    private Byte testByteWithBoxWithBox;

    private Short testShortWithBoxWithBox;

    private Integer testIntWithBoxWithBox;

    private Long testLongWithBoxWithBox;

    private Float testFloatWithBoxWithBox;

    private Double testDoubleWithBoxWithBox;

    private Character testCharWithBoxWithBox;

    private Boolean testBooleanWithBoxWithBox;

}
