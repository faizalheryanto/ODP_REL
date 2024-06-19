public class Comment {
    // single line comment

    /*
    multi line 1
    multi line 2
    etc
    */

    /**
     * documentation comment
     * line 1
     * line 2
     * etc
     */

    public static void main(String[] args) {
        Comment program = new Comment();
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