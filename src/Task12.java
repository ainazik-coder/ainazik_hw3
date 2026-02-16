
import java.util.*;

public class Task12 {
    public static void main(String[] args) {

        String text = "Java is fun and Java is powerful and fun";
        text = text.toLowerCase();
        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}