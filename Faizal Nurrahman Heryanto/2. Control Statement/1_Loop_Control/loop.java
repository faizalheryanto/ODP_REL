
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

        System.out.print("Example 1: Iterating Over a List of Integers\n");
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x : numbers2) {
            System.out.print(x);
            System.out.print(",");
        }

        System.out.println();

        System.out.print("\nExample 2: Iterating Over a List of Strings\n");
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

        System.out.println();
        System.out.print("Example 3: Iterating Over an Array of Objects");
        // Student[] students = { new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert") };

        // for( Students student : students ) {
        //    System.out.print( student );
        //    System.out.print(",");
        // }
        System.out.print("\n\n<-----END FOR EACH LOOP----->\n");

        System.out.print("\n<-----WHILE LOOP----->\n");

        System.out.print("\nExample 1: Printing Numbers in a Range Using while Loop\n");
        int x = 10;

        while (x < 20) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }

        System.out.print("\nExample 2: Printing Elements of an Array Using while Loop\n");

        int[] numbers3 = {10, 20, 30, 40, 50};
        int index = 0;

        while (index < 5) {
            System.out.print("value of item : " + numbers3[index]);
            index++;
            System.out.print("\n");
        }

        System.out.print("\nExample 3: Implementing Nested while Loop (infinite)\n");

        int x1 = 10;

        // while (true) {
        //     System.out.print("value of x : " + x1);
        //     x1++;
        //     System.out.print("\n");
        // }
        System.out.print("\n<-----END WHILE LOOP----->\n");

        System.out.print("\n<-----DO WHILE LOOP----->\n");

        System.out.print("\nExample 1: Printing Numbers in a Range Using do while \n");
        int x2 = 10;
        do {
            System.out.print("value of x : " + x2);
            x2++;
            System.out.print("\n");
        } while (x2 < 20);

        System.out.print("\nExample 2: Printing Elements of an Array Using do while\n");

        int[] numbers = {10, 20, 30, 40, 50};
        int index1 = 0;

        do {
            System.out.print("value of item : " + numbers[index1]);
            index1++;
            System.out.print("\n");
        } while (index1 < 5);

        System.out.print("\n Example 3 : Implementing an infinite do while Loop\n");
        // int x3 = 10;

        // do {
        //    System.out.print("value of x : " + x3 );
        //    x3++;
        //    System.out.print("\n");
        // } while( true );
        System.out.print("\n<-----END DO WHILE LOOP----->\n");

        System.out.print("\n<-----BREAK STATEMENT----->\n");

        System.out.print("\nExample 1: Using break with while loop\n");
        int x4 = 10;

        while (x4 < 20) {
            if (x4 == 15) {
                break;
            }
            System.out.print("value of x : " + x4);
            x4++;
            System.out.print("\n");
        }

        System.out.print("\nExample 2: Using break with for loop\n");

        int[] numbers4 = {10, 20, 30, 40, 50};

        for (int index2 = 0; index2 < numbers4.length; index2++) {
            if (numbers4[index2] == 30) {
                break;
            }
            System.out.print("value of item : " + numbers4[index2]);
            System.out.print("\n");
        }

        System.out.print("\nExample 3: Using break with an infinite loop\n");

        int x5 = 10;

        while (true) {
            System.out.print("value of x : " + x5);
            x5++;
            if (x5 == 15) {
                break;
            }
            System.out.print("\n");
        }
        System.out.print("\n<-----END BREAK----->\n");

        System.out.print("\n<-----CONTINUE----->\n");

        System.out.print("\nExample 1: Using continue with while loop\n");
        int x6 = 10;

        while (x6 < 20) {
            x6++;
            if (x6 == 15) {
                continue;
            }
            System.out.print("value of x : " + x6);
            System.out.print("\n");
        }
        System.out.print("\nExample 2: Using continue with for loop\n");
        int[] numbers5 = {10, 20, 30, 40, 50};

        for (int index3 = 0; index3 < numbers5.length; index3++) {
            if (numbers5[index3] == 30) {
                continue;
            }
            System.out.print("value of item : " + numbers5[index3]);
            System.out.print("\n");
        }

        System.out.print("\nExample 3: Using continue with do while loop\n");
        int x7 = 10;

        do {
            x7++;
            if (x7 == 15) {
                continue;
            }
            System.out.print("value of x : " + x7);
            System.out.print("\n");
        } while (x7 < 20);

        System.out.print("\n<-----END CONTINUE----->\n");


        

    }

}

class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + ", " + this.name + " ]";
    }
}
