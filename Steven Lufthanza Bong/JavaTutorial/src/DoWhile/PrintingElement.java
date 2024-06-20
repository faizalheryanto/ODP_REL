package DoWhile;

public class PrintingElement {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};
        int index = 0;

        do {
            System.out.print("value of item : " + numbers[index] );
            index++;
            System.out.print("\n");
        } while( index < 5 );
    }

}
