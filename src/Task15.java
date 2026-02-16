import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        String text = "swiss";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }

        System.out.println("None");
    }
}