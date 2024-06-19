package ForLoop;

public class NestedLoop {

    public static void main(String[] args) {
        int num = 1;
        int i = 1;

        for (num = 1; num <= 10; num++) {
            System.out.print("Table of " + num + " is : ");
            for (i = 1; i <= 10; i++) {
                System.out.print(num * i + " ");
            }
            System.out.println();
        }
    }
}
