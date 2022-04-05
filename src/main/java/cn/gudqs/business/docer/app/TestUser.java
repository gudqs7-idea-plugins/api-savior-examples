package cn.gudqs.business.docer.app;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
public class TestUser<T> {

    private int amount;

    private Integer amount0;

    private String name;

    private Date now;

    private T data;

    private BigDecimal bigDecimal;

    private List<T> list;

    private Map<String, T> map;

    private TestUser<T> otherUser;

}
