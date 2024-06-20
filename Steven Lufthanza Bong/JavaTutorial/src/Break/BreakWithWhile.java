package Break;

public class BreakWithWhile {

    public static void main(String args[]) {
        int x = 10;

        while( x < 20 ) {
            if(x == 15){
                break;
            }
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }

}
