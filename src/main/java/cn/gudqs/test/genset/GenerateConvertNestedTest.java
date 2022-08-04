package cn.gudqs.test.genset;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 转换器嵌套测试
 * @author wenquan
 * @date 2022/8/3
 */
public class GenerateConvertNestedTest {

    public static void main(String[] args) {
        UserBO src = new UserBO();
        UserDTO dst = new UserDTO();
    }

    public UserDTO convert(UserBO src) {
        if (src == null) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setName(src.getName());

        FooDTO fooDst0 = null;
        FooBO fooSrc0 = src.getFoo();
        if (fooSrc0 != null) {
            fooDst0 = new FooDTO();
            fooDst0.setStr1(fooSrc0.getStr1());
            fooDst0.setStr2(fooSrc0.getStr2());

            SonDTO sonDst1 = null;
            SonBO sonSrc1 = fooSrc0.getSon();
            if (sonSrc1 != null) {
                sonDst1 = new SonDTO();
                sonDst1.setSonStr(sonSrc1.getSonStr());
                sonDst1.setSonInt(sonSrc1.getSonInt());
            }
            fooDst0.setSon(sonDst1);

            UserDTO userDst1 = null;
            UserBO userSrc1 = fooSrc0.getUser();
            if (userSrc1 != null) {
                userDst1 = new UserDTO();
                userDst1.setName(userSrc1.getName());

                FooDTO fooDst2 = null;
                FooBO fooSrc2 = userSrc1.getFoo();
                if (fooSrc2 != null) {
                    fooDst2 = new FooDTO();
                    fooDst2.setStr1(fooSrc2.getStr1());
                    fooDst2.setStr2(fooSrc2.getStr2());

                    SonDTO sonDst3 = null;
                    SonBO sonSrc3 = fooSrc2.getSon();
                    if (sonSrc3 != null) {
                        sonDst3 = new SonDTO();
                        sonDst3.setSonStr(sonSrc3.getSonStr());
                        sonDst3.setSonInt(sonSrc3.getSonInt());
                    }
                    fooDst2.setSon(sonDst3);

                    UserDTO userDst3 = null;
                    UserBO userSrc3 = fooSrc2.getUser();
                    if (userSrc3 != null) {
                        userDst3 = new UserDTO();
                        userDst3.setName(userSrc3.getName());
                        userDst3.setFoo(null);
                        userDst3.setFooList(null);
                    }
                    fooDst2.setUser(userDst3);
                }
                userDst1.setFoo(fooDst2);

                List<FooDTO> fooListDst2 = null;
                List<FooBO> fooListSrc2 = userSrc1.getFooList();
                if (fooListSrc2 != null) {
                    fooListDst2 = fooListSrc2.stream().filter(Objects::nonNull).map(fooListSrc2Item -> {
                        FooDTO fooListDst2Item = new FooDTO();
                        fooListDst2Item.setStr1(fooListSrc2Item.getStr1());
                        fooListDst2Item.setStr2(fooListSrc2Item.getStr2());

                        SonDTO sonDst3 = null;
                        SonBO sonSrc3 = fooListSrc2Item.getSon();
                        if (sonSrc3 != null) {
                            sonDst3 = new SonDTO();
                            sonDst3.setSonStr(sonSrc3.getSonStr());
                            sonDst3.setSonInt(sonSrc3.getSonInt());
                        }
                        fooListDst2Item.setSon(sonDst3);

                        UserDTO userDst3 = null;
                        UserBO userSrc3 = fooListSrc2Item.getUser();
                        if (userSrc3 != null) {
                            userDst3 = new UserDTO();
                            userDst3.setName(userSrc3.getName());
                            userDst3.setFoo(null);
                            userDst3.setFooList(null);
                        }
                        fooListDst2Item.setUser(userDst3);
                        return fooListDst2Item;
                    }).collect(Collectors.toList());
                }
                userDst1.setFooList(fooListDst2);
            }
            fooDst0.setUser(userDst1);
        }
        userDTO.setFoo(fooDst0);

        List<FooDTO> fooListDst0 = null;
        List<FooBO> fooListSrc0 = src.getFooList();
        if (fooListSrc0 != null) {
            fooListDst0 = fooListSrc0.stream().filter(Objects::nonNull).map(fooListSrc0Item -> {
                FooDTO fooListDst0Item = new FooDTO();
                fooListDst0Item.setStr1(fooListSrc0Item.getStr1());
                fooListDst0Item.setStr2(fooListSrc0Item.getStr2());

                SonDTO sonDst1 = null;
                SonBO sonSrc1 = fooListSrc0Item.getSon();
                if (sonSrc1 != null) {
                    sonDst1 = new SonDTO();
                    sonDst1.setSonStr(sonSrc1.getSonStr());
                    sonDst1.setSonInt(sonSrc1.getSonInt());
                }
                fooListDst0Item.setSon(sonDst1);

                UserDTO userDst1 = null;
                UserBO userSrc1 = fooListSrc0Item.getUser();
                if (userSrc1 != null) {
                    userDst1 = new UserDTO();
                    userDst1.setName(userSrc1.getName());

                    FooDTO fooDst2 = null;
                    FooBO fooSrc2 = userSrc1.getFoo();
                    if (fooSrc2 != null) {
                        fooDst2 = new FooDTO();
                        fooDst2.setStr1(fooSrc2.getStr1());
                        fooDst2.setStr2(fooSrc2.getStr2());

                        SonDTO sonDst3 = null;
                        SonBO sonSrc3 = fooSrc2.getSon();
                        if (sonSrc3 != null) {
                            sonDst3 = new SonDTO();
                            sonDst3.setSonStr(sonSrc3.getSonStr());
                            sonDst3.setSonInt(sonSrc3.getSonInt());
                        }
                        fooDst2.setSon(sonDst3);

                        UserDTO userDst3 = null;
                        UserBO userSrc3 = fooSrc2.getUser();
                        if (userSrc3 != null) {
                            userDst3 = new UserDTO();
                            userDst3.setName(userSrc3.getName());
                            userDst3.setFoo(null);
                            userDst3.setFooList(null);
                        }
                        fooDst2.setUser(userDst3);
                    }
                    userDst1.setFoo(fooDst2);

                    List<FooDTO> fooListDst2 = null;
                    List<FooBO> fooListSrc2 = userSrc1.getFooList();
                    if (fooListSrc2 != null) {
                        fooListDst2 = fooListSrc2.stream().filter(Objects::nonNull).map(fooListSrc2Item -> {
                            FooDTO fooListDst2Item = new FooDTO();
                            fooListDst2Item.setStr1(fooListSrc2Item.getStr1());
                            fooListDst2Item.setStr2(fooListSrc2Item.getStr2());

                            SonDTO sonDst3 = null;
                            SonBO sonSrc3 = fooListSrc2Item.getSon();
                            if (sonSrc3 != null) {
                                sonDst3 = new SonDTO();
                                sonDst3.setSonStr(sonSrc3.getSonStr());
                                sonDst3.setSonInt(sonSrc3.getSonInt());
                            }
                            fooListDst2Item.setSon(sonDst3);

                            UserDTO userDst3 = null;
                            UserBO userSrc3 = fooListSrc2Item.getUser();
                            if (userSrc3 != null) {
                                userDst3 = new UserDTO();
                                userDst3.setName(userSrc3.getName());
                                userDst3.setFoo(null);
                                userDst3.setFooList(null);
                            }
                            fooListDst2Item.setUser(userDst3);
                            return fooListDst2Item;
                        }).collect(Collectors.toList());
                    }
                    userDst1.setFooList(fooListDst2);
                }
                fooListDst0Item.setUser(userDst1);
                return fooListDst0Item;
            }).collect(Collectors.toList());
        }
        userDTO.setFooList(fooListDst0);
        return userDTO;
    }

    @GetMapping("/test")
    public void testDoc(UserDTO userDTO) {

    }

}

@Data
class SonBO {
    private String sonStr;
    private Integer sonInt;
}

@Data
class FooBO {
    private String str1;
    private String str2;
    private SonBO son;
    private UserBO user;
}

@Data
class UserBO {
    private String name;
    private FooBO foo;
    private List<FooBO> fooList;
}

@Data
class SonDTO {
    private String sonStr;
    private Integer sonInt;
}

@Data
class FooDTO {
    private String str1;
    private String str2;
    private SonDTO son;
    private UserDTO user;
}

@Data
class UserDTO {
    private String name;
    private FooDTO foo;
    private List<FooDTO> fooList;
}