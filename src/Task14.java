import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        String[] words = {"hi", "book", "java", "sun", "loop", "map"};

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            int length = word.length();

            map.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }

        System.out.println(map);
    }
}