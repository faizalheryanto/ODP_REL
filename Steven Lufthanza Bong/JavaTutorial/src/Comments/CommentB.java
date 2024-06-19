package Comments;

public class CommentB {

    public static void main(String[] args) {
        CommentB program = new CommentB();
        double result = program.divide(100, 10);
        System.out.println(result);
    }

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        // if divisor is 0 throw an exception (Steven)
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor cannot be zero");
        }
        return (double) dividend / divisor; // returns the result of the division as double (Steven)
    }
}
