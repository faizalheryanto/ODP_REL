import java.util.Scanner;
//Java Scanner adalah pemindai teks sederhana yang dapat mengurai tipe
// dan string primitif menggunakan ekspresi reguler.

public class ScannerDemo {
    public static void main(String[] args) {

        String helloscanner = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(helloscanner);

        // print the next line of the string
        System.out.println(scanner.nextLine());

        // close the scanner
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner Closed.");
    }
}