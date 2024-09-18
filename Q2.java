package task7;
public class Q2 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 5};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException!");
        }

        try {
            String str = "ABDEFGHIJ";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException!");
        }
    }
}

