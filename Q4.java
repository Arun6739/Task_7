package task7;import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 { 
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt");
        
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        
    }
}

