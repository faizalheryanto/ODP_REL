public class BasicOperators {
    // Conditional Operator ( ? : ) dikenal juga sebagai ternary operator.
    // Terdiri dari tiga operan dan digunakan untuk mengevaluasi ekspresi Boolean.
    // Tujuan dari operator adalah memutuskan nilai mana yang harus diberikan pada variabel.

//    public static void main(String args[]) {
//        int a, b;
//        a = 10;
//        b = (a == 1) ? 20: 30;
//        System.out.println( "Value of b is : " +  b );
//
//        b = (a == 10) ? 20: 30;
//        System.out.println( "Value of b is : " + b );
//    }


    // Instanceof Operator
    // Hanya digunakan untuk objek reference variables untuk memeriksa apakah objek tersebut
    // bertipe tertentu (class type or interface type).

    public static void main(String args[]) {

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
    }


    // Operator Precendence
    // menentukan pengelompokan istilah dalam sebuah ekspresi
    // Contoh: operator perkalian memiliki prioritas lebih tinggi daripada operator penjumlahan

}
