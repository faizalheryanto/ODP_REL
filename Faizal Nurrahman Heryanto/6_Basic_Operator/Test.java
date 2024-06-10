
public class Test {

    public static void main(String args[]) {

        //////Arithmetic Ops///////
        //1. 
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

        //2. 
        a = 10;
        b = 20;
        int c = 25;

        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));

        //3. 
        a = 10;
        int d = 25;

        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));

        // Check the difference in d++ and ++d
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        ///////Relational Ops///////
        //1.
        a = 10;
        b = 20;

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        //2. 
        a = 10;
        b = 20;

        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));

        //3.
        a = 10;
        b = 20;

        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        //////BitWise Ops///////
        //1.
        a = 60;
        /* 60 = 0011 1100 */
        b = 13;
        /* 13 = 0000 1101 */
        c = 0;

        c = a & b;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        //2. 
        a = 60;
        /* 60 = 0011 1100 */
        b = 13;
        /* 13 = 0000 1101 */
        c = 0;

        c = a ^ b;
        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;
        /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        //3. 
        a = 60;
        /* 60 = 0011 1100 */
        c = 0;

        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

}
