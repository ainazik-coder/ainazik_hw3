import java.util.*;

public class Task22 {
    public static void main(String[] args) {

        String text = "java is fun java is cool java fun";
        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("Top 2:");
        for (int i = 0; i < 2 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}