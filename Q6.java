package task7;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Q6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(101, "charan");
        employees.put(102, "arun");
        employees.put(103, "bala");

        ArrayList<String> names = new ArrayList<>(employees.values());
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
