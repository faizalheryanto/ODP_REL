// Berikut adalah jenis operator dan deskripsinya
// Arithmetic Operator
// Addition (+) : untuk menambahkan value
// Substraction (-) : untuk mengurangi value dari sisi kanan ke sisi kiri
// Multiple (*) : mengalikan kedua nilai
// Division (/) : membagi nilai dari sisi kiri dengan sisi kanan
// Modulus (%) : sisa hasil bagi (modulo)
// Increment (++) : menambahkan nilai +1
// Decrement (--) : mengurangi nilai -1

// Relational Operators
// Equal to (==) : untuk mengecek apakah value dari dua nilai bernilai sama atau tidak
// Not equal to (!=) : untuk mengecek apakah value dari dua nilai bernilai tidak sama
// Greater than (>) : untuk mengecek apakah value sebuah nilai lebih besar dari nilai lainnya
// Less than (<) : untuk mengecek apakah value sebuah nilai lebih kecil dari nilai lainnya
// Greater than or equal to (>=) : untuk mengecek apakah value tersebut lebih besar atau sama dengan nilai lainnya
// Less than or equal to (<=) : untuk mengecek apakah value tersebut lebih kecil atau sama dengan nilai lainnya

public class OperatorTest {
    public static void main(String args[]) {
//        int a, b;
//        a = 10;
//        b = (a == 1) ? 20: 30;
//        System.out.println( "Value of b is : " +  b );
//
//        b = (a == 10) ? 20: 30;
//        System.out.println( "Value of b is : " + b );

        //Penggunaan instanceof
        String name = "James";
        Integer tlp = 123;
        //untuk mengecek apakah name mengandung String
        boolean result = name instanceof String;
        boolean result2 = tlp instanceof Integer;
        System.out.println( result );

        //perbedaan int dan Integer
        //int adalah tipe data primitif, tidak dapat menyimpan nilai null
        //Integer adalah kelas pembungkus untuk data primitif int. sering digunakan untuk fitur objek. dapat menyimpan null




    }
}
class Test extends OperatorTest{
    public static void main(String[] args) {
        //mengecek apakah a termasuk dalam class Operator Test atau Test
        OperatorTest a = new Test();
        boolean result =  a instanceof OperatorTest;
        System.out.println( result );
    }
}