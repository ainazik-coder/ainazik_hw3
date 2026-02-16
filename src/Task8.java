import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);

        boolean result = students.replace("Aida", 85, 86);
        System.out.println("Conditional replace: " + result);

        Integer oldValue = students.replace("Aida", 91);
        System.out.println("Unconditional replace old value: " + oldValue);

        Integer missing = students.replace("Mira", 100);
        System.out.println("Replace missing key: " + missing);

        System.out.println("Map: " + students);
    }
}