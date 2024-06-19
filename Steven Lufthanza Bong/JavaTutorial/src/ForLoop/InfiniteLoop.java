package ForLoop;

public class InfiniteLoop {

    public static void main(String args[]) {
        int x = 10;

        for( ;; ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }

}
