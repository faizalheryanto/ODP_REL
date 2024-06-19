package UserInput;
import java.util.Scanner;

public class JavaScanner {

    public static void main(String[] args) {

        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line of the string
        System.out.println(scanner.nextLine());

        // close the scanner
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner Clos");
    }
}
