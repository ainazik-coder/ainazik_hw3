import java.util.*;

public class Task17 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            String fruit = fruits[i];
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                map.put(fruit, 1);
            }
        }
        System.out.println("Unique:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Duplicates:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}