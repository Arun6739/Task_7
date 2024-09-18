package task7;
import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Arun");
        list.add("Thiru");
        list.add("Guru");

        String[] array = list.toArray(new String[0]);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
