package Comments;

public class CommentA {
    public static void checkDivisor(int divisor) {
        // if divisor is 0 throw an exception (Comment Steven)
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor cannot be zero");
        }
    }
}
