import amazonQA.Alexa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        List<List<Integer>> allLocations = new ArrayList<>();
        List<Integer> location1 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> location2 = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> location3 = new ArrayList<>(Arrays.asList(1, -1));
        allLocations.add(location1);
        allLocations.add(location2);
        allLocations.add(location3);

        List<List<Integer>> restaurants = Alexa.findRestaurants2(allLocations, 2);
        System.out.println(restaurants);

    }
}