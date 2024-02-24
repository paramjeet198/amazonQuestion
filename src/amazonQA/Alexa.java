package amazonQA;

import java.util.*;

public class Alexa {

    public static List<List<Integer>> findRestaurants(List<List<Integer>> allLocations, int numRestaurants) {
        allLocations.sort((o1, o2) -> {
            var dis1 = getDistance(o1);
            var dis2 = getDistance(o2);
            return Double.compare(dis1, dis2);
        });
        return allLocations.subList(0, numRestaurants);
    }

    public static List<List<Integer>> findRestaurants2(List<List<Integer>> allLocations, int numRestaurants) {

        Map<Double, List<Integer>> map = new HashMap<>();
        List<Double> distList = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (List<Integer> list : allLocations) {
            distList.add(getDistance(list));
            map.put(getDistance(list), list);
        }

        Collections.sort(distList);
        for (int i = 0; i < numRestaurants; i++) {
            double dist = distList.get(i);
            ans.add(map.get(dist));
        }

        return ans;
    }


    private static double getDistance(List<Integer> pair) {
        var x = pair.get(0);
        var y = pair.get(1);
        return Math.sqrt(x * x + y * y);
    }
}
