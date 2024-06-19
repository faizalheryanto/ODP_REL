package Comments;

public class CommentC {

    public static void main(String[] args) {
        CommentC program = new CommentC();
        double result = program.divide(100, 10);
        System.out.println(result);
    }

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor cannot be zero");
        }
      /* if (dividend == 0) {
         throw new IllegalArgumentException("dividend cannot be zero");
      } */

        // (Steven)

        return (double) dividend / divisor;
    }


}
