import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.putIfAbsent("Aida", 90);  // не изменится
        students.putIfAbsent("Mira", 80);  // добавится
        System.out.println(students);
        System.out.println("Aida keeps old value because key already exists.");
        System.out.println("Mira was inserted because key was missing.");
    }
}