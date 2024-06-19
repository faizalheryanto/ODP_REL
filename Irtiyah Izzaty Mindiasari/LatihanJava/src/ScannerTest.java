import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String s = "Halo selamat pagi,";

        Scanner scanner = new Scanner(System.in);
        String ketik = scanner.nextLine();

        System.out.println(s + " " + ketik);

        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner Closed");
    }
}
