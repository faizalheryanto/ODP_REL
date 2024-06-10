public class Operator {
    public static void main(String args[]) {
        int a, b, c;
        a = 10;
        c= 20;
        System.out.println("a - c = " + (a - c) );
        System.out.println("a * c = " + (a * c) );
        System.out.println("a + c = " + (a + c) );
        System.out.println("c / a = " + (c / a) );

        //ternary operator
        //variable x = (expression) ? value if true : value if false
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        b = 20;
        c = 25;

        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );

        int d = 25;
        // increment & decrement
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " + (a--) );


        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) ); //d++   = 25
        System.out.println("++d   = " +  (++d) ); //++d   = 27


        //instanceof operator we've checking the name is of String or not.
        String name = "Leila";
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
