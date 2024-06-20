package Break;

public class BreakWithInfinite {

    public static void main(String args[]) {
        int x = 10;

        while( true ) {
            System.out.print("value of x : " + x );
            x++;
            if(x == 15) {
                break;
            }
            System.out.print("\n");
        }
    }
}
