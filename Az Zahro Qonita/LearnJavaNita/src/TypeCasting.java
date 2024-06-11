public class TypeCasting {
    //Widening Type Casting
//
//    // Main driver method
//    public static void main(String[] args) {
//        // Define int variables
//        int num1 = 5004;
//        double num2 = -180.89;
//        double num3 = 2.5;
//        double sum = num1 + num2 + num3;
//        // show output
//        System.out.println("The sum of " + num1 + " and " + num2 + " and " + num3 + " is " + sum);
//    }

    //Narrowing Type Casting
    public static void main(String[] args) {
        // Define int variable
        int num = 5004;
        // Type casting int to double
        double doubleNum = (double) num;
        // show output
        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
        // Type casting double to int
        int convertedInt = (int) doubleNum;
        // show output
        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
    }
}



