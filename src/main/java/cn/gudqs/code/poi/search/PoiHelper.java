package cn.gudqs.code.poi.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author WQ
 * @date 2021/12/25
 */
public class PoiHelper {

    /**
     * 随机数
     *
     * @param start 起始
     * @param end   结束
     * @return 返回 start <= x < end
     */
    public static int randomNumber(int start, int end) {
        Random random = new Random();
        int base = end - start;
        return start + random.nextInt(base);
    }

    public static List<PoiInfo> generatePoi(int poiSize) {
        // 生成 1000w 个 poi
        List<PoiInfo> poiInfoList = new ArrayList<>();
        // lon: -180 ~ 180
        // lat: -85 ~ 85
        for (int i = 0; i < poiSize; i++) {
            int lon = randomNumber(-180000, 180000);
            int lat = randomNumber(-85000, 85000);

            PoiInfo poiInfo = new PoiInfo();
            int id = i + 1;
            poiInfo.setPoiId(id);
            poiInfo.setPoiName("Poi_" + id);
            poiInfo.setType("poi");
            poiInfo.setLon(lon / 1000f);
            poiInfo.setLat(lat / 1000f);
            poiInfoList.add(poiInfo);
        }
        return poiInfoList;
    }

    public static List<PoiInfo> generateNeighborhood(int poiSize) {
        // 生成 10w 个小区
        List<PoiInfo> neighborhoodList = new ArrayList<>();
        for (int i = 0; i < poiSize; i++) {
            int lon = randomNumber(-180000, 180000);
            int lat = randomNumber(-85000, 85000);

            PoiInfo poiInfo = new PoiInfo();
            int id = i + 1;
            poiInfo.setPoiId(id);
            poiInfo.setPoiName("Neighborhood_" + id);
            poiInfo.setType("neighborhood");
            poiInfo.setLon(lon / 1000f);
            poiInfo.setLat(lat / 1000f);
            neighborhoodList.add(poiInfo);
        }
        return neighborhoodList;
    }

}
