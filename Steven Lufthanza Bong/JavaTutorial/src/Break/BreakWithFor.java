package Break;

public class BreakWithFor {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] == 30){
                break;
            }
            System.out.print("value of item : " + numbers[index] );
            System.out.print("\n");
        }
    }
}
