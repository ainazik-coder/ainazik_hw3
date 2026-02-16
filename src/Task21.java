import java.util.*;

public class Task21 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 90);
        students.put("Azat", 80);
        students.put("Dana", 90);
        students.put("Mira", 80);

        HashMap<Integer, ArrayList<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {

            String name = entry.getKey();
            Integer score = entry.getValue();

            result.computeIfAbsent(score, k -> new ArrayList<>()).add(name);
        }

        System.out.println(result);
    }
}