import java.util.*;

public class Task10 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Dana", 70);
        students.put("Mira", 90);

        int count = 0;

        for (Integer value : students.values()) {
            if (value >= 80) {
                count++;
            }
        }

        System.out.println("Students with score >= 80: " + count);
    }
}