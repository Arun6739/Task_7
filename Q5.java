package task7;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("Before removing: " + list);
        list.clear();
        System.out.println("After removing: " + list);
    }
}
