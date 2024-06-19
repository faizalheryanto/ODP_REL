package TypeCasting;

public class NarrowingTypeCasting {
    public static void main(String[] args) {

        int num = 5004;

        double doubleNum = (double) num;

        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);

        int convertedInt = (int) doubleNum;

        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
    }


}
