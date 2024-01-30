package backEND;

import Database.ConnectionWithDatabase;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import static Database.ConnectionWithDatabase.numofStudentInDepartment;
import static Database.ConnectionWithDatabase.timeForPeakAnalysis;

public class backEND {

    //4th rating system
    public static double CalculateAverageRating() {
        int[] ratings = {4, 5, 3, 2, 4, 5};//amir
        int sum = 0;

        for (int rating : ratings) {
            sum += rating;
        }

        return (double) sum / ratings.length;
    }

    //5th average student number
    public static int averageStudentPresented() {
        ArrayList<Integer> ASP = ConnectionWithDatabase.numOfStudent();
        int sum = 0;
        for (int i = 0; i < ASP.size(); i++) {
            sum += ASP.get(i);
        }
        //System.out.println(sum);
        int average = sum / ASP.size();
        return average;
    }

    //6th average student number

    public static String FavoriteFood() {
        int[] totalCounts = new int[]{10, 34, 25};
        String[] foodChoice = new String[]{"firfir", "dabo", "colo"};
        int max = totalCounts[0];
        String food = null;
        for (int i = 1; i < totalCounts.length; i++) {
            if (totalCounts[i] > max) {
                max = totalCounts[i];
                food = foodChoice[i];
            }

        }

        return food;
    }
//7
    public static String LeastFavorite() {
        int[] totalCounts = new int[]{10, 34, 45};
        String[] foodChoice = new String[]{"firfir", "dabo", "colo"};
        int min = totalCounts[0];
        String food = null;
        for (int i = 0; i < totalCounts.length; i++) {
            if (totalCounts[i] <= min) {
                min = totalCounts[i];
                food = foodChoice[i];
            }
        }
        return food;
    }
//8
    public static ArrayList<LocalTime> getTimestampData() {
        ArrayList<LocalTime> timestampData = timeForPeakAnalysis();

        // Generate sample timestamp data
        return timestampData;
    }
//9
    public static LocalTime identifyPeakTime(ArrayList<LocalTime> timestampData) {

        Map<String, Integer> timestampCountMap = new HashMap<>();

        // Count the number of students for each timestamp
        for (LocalTime timestamp : timestampData) {
            timestampCountMap.put(String.valueOf(timestamp), timestampCountMap.getOrDefault(timestamp, 0) + 1);
        }

        // Find the timestamp with the maximum student count
        LocalTime peakTime = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : timestampCountMap.entrySet()) {
            LocalTime timestamp = LocalTime.parse(entry.getKey());
            Integer count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                peakTime = timestamp;
            }
        }
        return peakTime;
    }
//10
    public static ArrayList<String> getKeysFromHashMap(HashMap<String, Integer> map) {
        ArrayList<String> keys = new ArrayList<>();
        for (String key : map.keySet()) {
            keys.add(key);
        }
        return keys;
    }

    //11
    public static ArrayList<Integer> getValuesFromHashMap(HashMap<String, Integer> map) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int value : map.values()) {
            values.add(value);
        }
        return values;
    }

    //12 poll create

}




