import java.util.*;

public class Task9 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Dana", 80);
        students.put("Mira", 88);

        System.out.println("Keys:");
        for (String key : students.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}