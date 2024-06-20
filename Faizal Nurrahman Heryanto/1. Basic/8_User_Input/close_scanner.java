
import java.util.Scanner;

public class close_scanner {

    public static void main(String[] args) {
        System.out.println("\nScanner on String\n");
        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line of the string
        System.out.println(scanner.nextLine());

        // close the scanner
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner Closed.");

        System.out.println("\nScanner on User Input\n");
        // create a new scanner with the system input
        Scanner scanner2 = new Scanner(System.in);

        // print the next line of the string
        System.out.println(scanner2.nextLine());

        // close the scanner
        System.out.println("Closing Scanner...");
        scanner2.close();
        System.out.println("Scanner Closed.");

        System.out.println("\nScanner on Properties File\n");

        // Scanner scanner3 = new Scanner(new File("properties.txt"));

        // // print the next line of the string
        // System.out.println(scanner3.nextLine());

        // // close the scanner
        // System.out.println("Closing Scanner...");
        // scanner3.close();
        // System.out.println("Scanner Closed.");

    }
}
