import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Azat", 92);
        students.put("Dana", 77);

        Integer oldValue = students.put("Dana", 80);

        System.out.println("Old value: " + oldValue);
        System.out.println("New map: " + students);
    }
}