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


}
