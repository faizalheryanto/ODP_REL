import java.util.Scanner;
public class ModulDua {
    public static void main(String args[]) {
        String a, b;
        //untuk memasukkan inputan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The value for variable a");
        a = scanner.nextLine();
        System.out.println("Enter The value for variable b");
        b = scanner.nextLine();

        //nilai dari inputan di simpan dalam a dan b kemudian di print
        System.out.println("The value you have entered for a is " + a);
        System.out.println("The value you have entered for b is " + b);
        scanner.close();
    }
}
