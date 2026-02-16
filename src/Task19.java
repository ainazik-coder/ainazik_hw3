import java.util.*;

public class Task19 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 75);
        students.put("Azat", 50);
        students.put("Dana", 40);
        students.put("Mira", 90);

        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }

        System.out.println(students);
    }
}