import java.util.*;

public class Task11 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Dana", 95);
        students.put("Mira", 90);

        int maxScore = 0;
        String topStudent = "";

        for (Map.Entry<String, Integer> entry : students.entrySet()) {

            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Highest score: " + maxScore);
        System.out.println("Student: " + topStudent);
    }
}
