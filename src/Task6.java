import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Mira", 90);
        int score1 = students.getOrDefault("Mira", -1);
        if (score1 == -1) {
            System.out.println("Mira not found");
        } else {
            System.out.println("Mira score: " + score1);
        }
        int score2 = students.getOrDefault("Azat", -1);
        if (score2 == -1) {
            System.out.println("Azat not found");
        } else {
            System.out.println("Azat score: " + score2);
        }
    }
}