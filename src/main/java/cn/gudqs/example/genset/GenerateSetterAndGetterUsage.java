package cn.gudqs.example.genset;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Foo extends Parent {

    private Integer testInt;

    private Long testLong;

    private Float testFloat;

    private Double testDouble;

    private Boolean testBoolean;

}

@Data
class Parent {

    private Integer parentInt;

    private String parentStr;

}

/**
 * @author wq
 */
public class GenerateSetterAndGetterUsage {

    public void usage01() {
        // 用法1, 生成所有 set 方法, 带默认值, 通过 postfix
        Foo foo = new Foo();
        // 取消下面的注释, 光标位于 allset 后面, 按下 Tab 键
//        foo.allset
        // 即可得到下面结果, 且 foo.allset 会自动消失
        foo.setTestInt(0);
        foo.setTestLong(0L);
        foo.setTestFloat(0f);
        foo.setTestDouble(0D);
        foo.setTestBoolean(false);
    }

    public void usage02() {
        // 用法2, 生成所有 set 方法, 不带默认值, 通过 postfix
        Foo foo = new Foo();
        // 取消下面的注释, 光标位于 allsetn 后面, 按下 Tab 键
//        foo.allsetn
        /*
        foo.setTestInt();
        foo.setTestLong();
        foo.setTestFloat();
        foo.setTestDouble();
        foo.setTestBoolean();
         */
    }

    public void usage03() {
        // 用法3, 生成所有 get 方法, 通过 postfix
        Foo foo = new Foo();
        // 取消下面的注释, 光标位于 allget 后面, 按下 Tab 键
//        foo.allget
        // 即可得到下面结果, 且 foo.allget 会自动消失
        Integer testInt = foo.getTestInt();
        Long testLong = foo.getTestLong();
        Float testFloat = foo.getTestFloat();
        Double testDouble = foo.getTestDouble();
        Boolean testBoolean = foo.getTestBoolean();
    }

    public void usage04() {
        // 用法4, 生成所有 set 方法, 通过 builder, 通过 postfix
        // 取消下面的注释, 光标位于 allbuilder 后面, 按下 Tab 键
//        Foo.builder().allbuilder
        // 即可得到下面结果
        Foo foo = Foo.builder()
                .testInt(0)
                .testLong(0L)
                .testFloat(0f)
                .testDouble(0D)
                .testBoolean(false)
                .build();
    }

    public void usage05() {
        // 用法5, 将 src 的数据赋值给 dest, 常用于两个不同类直接进行 convert(需字段名称相同), 通过 postfix
        Foo src = new Foo();
        Foo dest = new Foo();
        // 取消下面的注释, 光标位于 convert 后面, 按下 Tab 键
//        dest.setTestInt(src.getTestInt());.convert
        // 即可得到下面结果
        dest.setTestInt(src.getTestInt());
        dest.setTestLong(src.getTestLong());
        dest.setTestFloat(src.getTestFloat());
        dest.setTestDouble(src.getTestDouble());
        dest.setTestBoolean(src.getTestBoolean());

        // 新方式: 仅通过 dest 来生成, src 对象用户自己输入
        // 取消下面的注释, 光标位于 convert 后面, 按下 Tab 键
//        dest.convert
        // 即可得到下面结果, 其中 sourceObj 会被选中且可编辑, 此时修改会修改所有语句, 在本示例中, 输入 src 回车即可
//        dest.setTestInt(sourceObj.getTestInt());
//        dest.setTestLong(sourceObj.getTestLong());
//        dest.setTestFloat(sourceObj.getTestFloat());
//        dest.setTestDouble(sourceObj.getTestDouble());
//        dest.setTestBoolean(sourceObj.getTestBoolean());
//        dest.setParentInt(sourceObj.getParentInt());
//        dest.setParentStr(sourceObj.getParentStr());

    }

    public void usage06() {
        // 用法 6 通过在 foo 变量上触发 Show Context Actions, 快捷键(如 Alt + Enter 或右键菜单选择)
        // 可看到 Generate Getter / Generate Setter with no default val / Generate Setter
        //    这几个 Generate 开头的选项, 对应 usage01/usage03/usage02 用法
        Foo foo = new Foo();
    }

    public void usage07(Foo foo) {
        // 用法 7 通过在方法形参 foo 变量上触发 Show Context Actions, 快捷键(如 Alt + Enter 或右键菜单选择)
        // 可看到 Generate Getter / Generate Setter with no default val / Generate Setter
        //    这几个 Generate 开头的选项, 对应 usage01/usage03/usage02 用法
    }

    public void usage08() {
        // 同 usage06 / usage07, 在 entry 变量上触发 Show Context Actions, 快捷键(如 Alt + Enter 或右键菜单选择)
        Map<String, List<Foo>> fooMap = new HashMap<>(2);
        fooMap.put("notEmpty", new ArrayList<>());
        for (Map.Entry<String, List<Foo>> entry : fooMap.entrySet()) {
            System.out.println("not empty body");
        }
    }

    public Foo usage09(Foo src) {
        // 用法9 通过在方法名称上触发 Show Context Actions, 快捷键(如 Alt + Enter 或右键菜单选择)
        //  可看到 Generate Convert，选中后生成下面注释里的内容（不包含 return null;)
//        Foo foo = new Foo();
//        foo.setTestInt(src.getTestInt());
//        foo.setTestLong(src.getTestLong());
//        foo.setTestFloat(src.getTestFloat());
//        foo.setTestDouble(src.getTestDouble());
//        foo.setTestBoolean(src.getTestBoolean());
//        return foo;
        return null;
    }

}
