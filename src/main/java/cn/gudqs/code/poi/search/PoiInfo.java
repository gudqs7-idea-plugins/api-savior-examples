package cn.gudqs.code.poi.search;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WQ
 * @date 2021/12/25
 */
@Data
public class PoiInfo {

    private Integer poiId;

    private String poiName;

    private String type;

    /**
     * 经度
     */
    private Float lon;

    /**
     * 纬度
     */
    private Float lat;

    private List<PoiInfo> poiInfoList = new ArrayList<>();

}
