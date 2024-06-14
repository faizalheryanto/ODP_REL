
import java.util.Arrays;
import java.util.List;

public class loop {

    public static void main(String args[]) {

        System.out.print("\n<-----FOR LOOP----->\n");
        System.out.print("\nPrinting number\n");
        for (int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("Print array element\n");

        int[] numbers1 = {10, 20, 30, 40, 50};

        for (int index = 0; index < numbers1.length; index++) {
            System.out.print("value of item : " + numbers1[index]);
            System.out.print("\n");
        }

        System.out.print("\nInfinite loop, Ctrl+C to exit\n");
        // int x = 10;

        // for (;;) {
        //     System.out.print("value of x : " + x);
        //     x++;
        //     System.out.print("\n");
        // }
        System.out.print("\nNested loop (make tables)\n");
        // Implementing nested for loop
        // Initializing loop counters 
        int num = 1;
        int i = 1;

        // outer for loop
        for (num = 1; num <= 10; num++) {
            //inner for loop
            System.out.print("Table of " + num + "\tis : ");
            for (i = 1; i <= 10; i++) {
                // printing table
                System.out.print("\t" + num * i);
            }
            // printing a new line
            System.out.println();

        }

        System.out.print("\n<-----END FOR LOOP----->\n");

        System.out.print("\n<-----FOR EACH LOOP----->\n\n");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }

        System.out.println();

        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        System.out.print("\n\n<-----END FOR EACH LOOP----->\n");

        System.out.print("\n<-----WHILE LOOP----->\n");

        System.out.print("\n<-----END WHILE LOOP----->\n");

        System.out.print("\n<-----IF ELSE----->\n");
        System.out.print("\n<-----END IF ELSE----->\n");

    }

}
