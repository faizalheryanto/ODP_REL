package ForLoop;

public class PrintingArray {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("value of item : " + numbers[index] );
            System.out.print("\n");
        }
    }
}

