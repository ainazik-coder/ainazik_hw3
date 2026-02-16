import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Aida", 85);
        students.put("Dana", 77);

        System.out.println("Is empty before clear? " + students.isEmpty());

        students.clear();

        System.out.println("Is empty after clear? " + students.isEmpty());
    }
}