public class Narrowing {
    // Main driver method
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