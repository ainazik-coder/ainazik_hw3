import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Azat", 92);
        students.put("Dana", 77);

        System.out.println("Aida score: " + students.get("Aida"));

        if (students.containsKey("Mira")) {
            System.out.println("Mira score: " + students.get("Mira"));
        } else {
            System.out.println("Mira not found.");
        }
    }
}