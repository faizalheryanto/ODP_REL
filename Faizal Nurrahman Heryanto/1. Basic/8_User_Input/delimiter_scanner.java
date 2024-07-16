
import java.util.Scanner;

public class delimiter_scanner {

    public static void main(String[] args) {
        System.out.println("\nDelimiter on a String\n");
        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line of the string
        System.out.println(scanner.nextLine());

        // print the delimiter this scanner is using
        System.out.println(scanner.delimiter());

        // close the scanner
        scanner.close();

        System.out.println("\nCustom Delimiter on String\n");
        String input = "1 abc 2 abc";
        Scanner scanner2 = new Scanner(input).useDelimiter("\\s*abc\\s*");
        System.out.println(scanner2.nextInt());
        System.out.println(scanner2.nextInt());
        // print the delimiter this scanner is using
        System.out.println(scanner2.delimiter());

        // close the scanner
        scanner2.close();

        System.out.println("\nDelimiter used by Scanner on User Input\n");

        String s3 = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner3 = new Scanner(System.in);

        // print the next line of the string
        System.out.println(scanner3.nextLine());

        // print the delimiter this scanner is using
        System.out.println(scanner3.delimiter());

        // close the scanner
        scanner3.close();
    }
}
