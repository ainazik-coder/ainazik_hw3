
import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Azat", 92);
        students.put("Dana", 77);

        Integer removed = students.remove("Azat");

        if (removed != null) {
            System.out.println("Removed successfully.");
        } else {
            System.out.println("Key not found.");
        }

        System.out.println("Map: " + students);
    }
}