package cn.gudqs.code.poi.search;

import java.util.List;

/**
 * @author WQ
 * @date 2021/12/25
 */
public class App {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<PoiInfo> neighborhood = PoiHelper.generateNeighborhood(100000);
        long end1 = System.currentTimeMillis();
        System.out.println("generateNeighborhood cost: " + (end1 - start) / 1000);
        List<PoiInfo> poiInfoList = PoiHelper.generatePoi(10000000);
        long end2 = System.currentTimeMillis();
        System.out.println("generatePoi cost: " + (end2 - end1) / 1000);

        for (PoiInfo poiInfo : poiInfoList) {
            for (PoiInfo nei : neighborhood) {
                Float lat = nei.getLat();
                Float lon = nei.getLon();

                if (poiInfo.getLat() < lat + 0.03
                        && poiInfo.getLat() > lat - 0.03
                        && poiInfo.getLon() < lon + 0.03
                        && poiInfo.getLon() > lon - 0.03
                ) {
                    nei.getPoiInfoList().add(poiInfo);
                }
            }
        }
        long end3 = System.currentTimeMillis();
        System.out.println("compare cost: " + (end3 - end2) / 1000);

        for (PoiInfo poiInfo : neighborhood) {
            if (poiInfo.getPoiInfoList().size() > 0) {
                System.out.println(poiInfo);
            }
        }
        System.out.println("all cost: " + (end3 - start) / 1000);
    }

}
