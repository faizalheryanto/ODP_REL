public class TipeData {

    String hewan;
    String kalimat;
    void Animal(String animal){
        hewan = animal;
    }

    void String(String string){
        kalimat = string;
    }
    public static void main(String args[]) {
        //tipe data byte. bilangan bulat. Min -2^7. Max (2^7)-1.
        byte byteValue1 = 2;
        byte byteValue2 = 4;
        byte byteResult = (byte)(byteValue1 + byteValue2);

        System.out.println("Byte: " + byteResult);

        //tipe data short. bilangan bulat. Min -2^15. Max (2^15)-1.
        short shortValue1 = 2;
        short shortValue2 = 4;
        short shortResult = (short)(shortValue1 + shortValue2);

        System.out.println("Short: " + shortResult);

        //tipe data int. bilangan bulat. Min -2^31 Max (2^31)-1.
        int intValue1 = 2;
        int intValue2 = 4;
        int intResult = intValue1 + intValue2;

        System.out.println("Int: " + intResult);

        //tipe data long. bilangan bulat. Min -2^63. Max (2^63)-1.
        long longValue1 = 2L;
        long longValue2 = 4L;
        long longResult = longValue1 + longValue2;

        System.out.println("Long: " + longResult);

        //tipe data float. Bilangan desimal. 32 bit
        float floatValue1 = 2.0f;
        float floatValue2 = 4.0f;
        float floatResult = floatValue1 + floatValue2;

        System.out.println("Float: " + floatResult);

        //tipe data double. Bilangan desimal. 64 bit
        double doubleValue1 = 2.0;
        double doubleValue2 = 4.0;
        double doubleResult = doubleValue1 + doubleValue2;

        System.out.println("Double: " + doubleResult);

        //tipe data boolean untuk mengecek statement true or false
        boolean booleanValue = true;

        System.out.println("Boolean: " + booleanValue);

        //tipe data char. char data type is a single 16-bit Unicode character
        char charValue = 'A';

        System.out.println("Char: " + charValue);

        //tipe data String untuk menyimpan karakter dalam sebuah kalimat atau pernyataan
        String stringValue = "Tiya ODP IT BNI 23 Tahun";
        System.out.println("String: " + stringValue);

        }
}
