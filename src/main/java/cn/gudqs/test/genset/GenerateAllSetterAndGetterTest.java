package cn.gudqs.test.genset;

/**
 * GenerateAllSetterAndGetter 相关使用指南
 * @author gudqs7
 */
public class GenerateAllSetterAndGetterTest {

    public void test01() {
        TestBaseType testBaseType = new TestBaseType();
//        testBaseType.allset
        TestModel<TestBaseType> testModel = new TestModel<>();
//        testModel.allset
    }

    public void test02() {
        TestBaseType testBaseType = new TestBaseType();
//        testBaseType.allget
        TestModel<TestBaseType> testModel = new TestModel<>();
//        testModel.allget
    }

    public void test03() {
//        TestBaseType.builder().allbuilder
//        TestModel.builder().allbuilder
    }

    public void test04() {
        TestBaseType src1 = new TestBaseType();
        TestBaseType dest1 = new TestBaseType();
//        dest1.setTestByte(src1.getTestByte());.convert

        TestModel<TestBaseType> src2 = new TestModel<>();
        TestModel<TestBaseType> dest2 = new TestModel<>();
//        dest2.setData(src2.getData());.convert

    }

    public ReturnTestBaseType test05(TestBaseType testBaseTypeSrc) {
        ReturnTestBaseType returnTestBaseType = new ReturnTestBaseType();
        returnTestBaseType.setTestByte(testBaseTypeSrc.getTestByte());
        returnTestBaseType.setTestShort(testBaseTypeSrc.getTestShort());
        returnTestBaseType.setTestInt(testBaseTypeSrc.getTestInt());
        returnTestBaseType.setTestLong(testBaseTypeSrc.getTestLong());
        returnTestBaseType.setTestFloat(testBaseTypeSrc.getTestFloat());
        returnTestBaseType.setTestDouble(testBaseTypeSrc.getTestDouble());
        returnTestBaseType.setTestChar(testBaseTypeSrc.getTestChar());
        returnTestBaseType.setTestBoolean(testBaseTypeSrc.isTestBoolean());
        returnTestBaseType.setTestByteWithBoxWithBox(testBaseTypeSrc.getTestByteWithBoxWithBox());
        returnTestBaseType.setTestShortWithBoxWithBox(testBaseTypeSrc.getTestShortWithBoxWithBox());
        returnTestBaseType.setTestIntWithBoxWithBox(testBaseTypeSrc.getTestIntWithBoxWithBox());
        returnTestBaseType.setTestLongWithBoxWithBox(testBaseTypeSrc.getTestLongWithBoxWithBox());
        returnTestBaseType.setTestFloatWithBoxWithBox(testBaseTypeSrc.getTestFloatWithBoxWithBox());
        returnTestBaseType.setTestDoubleWithBoxWithBox(testBaseTypeSrc.getTestDoubleWithBoxWithBox());
        returnTestBaseType.setTestCharWithBoxWithBox(testBaseTypeSrc.getTestCharWithBoxWithBox());
        returnTestBaseType.setTestBooleanWithBoxWithBox(testBaseTypeSrc.getTestBooleanWithBoxWithBox());
        returnTestBaseType.setTestString(testBaseTypeSrc.getTestString());
        returnTestBaseType.setTestDate(testBaseTypeSrc.getTestDate());
        returnTestBaseType.setTestDecimal(testBaseTypeSrc.getTestDecimal());
        returnTestBaseType.setTestNumber(testBaseTypeSrc.getTestNumber());
        returnTestBaseType.setTestTime(testBaseTypeSrc.getTestTime());
        returnTestBaseType.setTestTimestamp(testBaseTypeSrc.getTestTimestamp());
        returnTestBaseType.setTestSqlDate(testBaseTypeSrc.getTestSqlDate());
        returnTestBaseType.setTestAdd(null/* 源对象无此字段 */);
        returnTestBaseType.setFile(testBaseTypeSrc.getFile());
        return returnTestBaseType;
    }

}
