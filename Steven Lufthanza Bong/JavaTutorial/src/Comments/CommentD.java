package Comments;

public class CommentD {
    public static void main(String[] args) {
       CommentD program = new CommentD();
        double result = program.divide(100, 10);
        System.out.println(result);
    }

    /**
     * @param dividend
     * @param divisor
     * @return quotient
     * @throws IllegalArgumentException if divisor is zero
     */
    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor cannot be zero");
        }
        return (double) dividend / divisor;
    }



}
