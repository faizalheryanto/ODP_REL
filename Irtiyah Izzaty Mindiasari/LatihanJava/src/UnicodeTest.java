public class UnicodeTest {
    public static void main(String[] args) {
//        // Define int variable
//        int num = 5004;
//        // Type casting int to double
//        double doubleNum = (double) num;
//        // show output
//        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
//        // Type casting double to int
//        int convertedInt = (int) doubleNum;
//        // show output
//        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);


//        char unicodeChar = '\u0041';
//        // point for 'A'
//        System.out.println("Stored Unicode Character: " + unicodeChar);
//
//        char unicodeChar2 = 'A';
//        // Directly storing the character 'A'
//        System.out.println("Stored Unicode Character: " + unicodeChar2);

//        char letterA = '\u0041';
//        char letterSigma = '\u03A3';
//        char copyrightSymbol = '\u00A9';
//        // Storing Unicode characters directly
//        char letterZ = 'Z';
//        char letterOmega = 'Ω';
//        char registeredSymbol = '®';
//        // Printing the stored Unicode characters
//        System.out.println("Stored Unicode Characters using Escape Sequences:");
//        System.out.println("Letter A: " + letterA);
//        System.out.println("Greek Capital Letter Sigma: " + letterSigma);
//        System.out.println("Copyright Symbol: " + copyrightSymbol);
//        System.out.println("\nStored Unicode Characters Directly:");
//        System.out.println("Letter Z: " + letterZ);
//        System.out.println("Greek Capital Letter Omega: " + letterOmega);
//        System.out.println("Registered Symbol: " + registeredSymbol);

        // Storing Unicode characters using escape sequences
        char letterA = '\u0041';
        char letterSmallA = '\u0061';
        // Storing Unicode characters directly
        char letterB = 'B';

        // Manipulating the stored Unicode characters
        int difference = letterA - letterSmallA; //untuk mengetahui perbedaan karakter A dan a dalam hexadesimal
                                                //A = 65, a = 97. difference = 65 - 97 = -32
        char letterC = (char) (letterB + difference); // untuk mengetahui karakter setelah menghitung hexadesimal letter B dan difference dlm char
                                                      // B = 66, Letter C = 66 + (-32) = 34. char 34 adalah "
        char letterSmallC = (char) (letterC + 32); //untuk mengetahui karakter setelah menghitung hex letter c ditambahkan dengan 32 dlm char
                                                    // letterC = " = 34, LetterSmallC = 34 + 32 = 66 = (char) B
        // Printing the manipulated Unicode characters
        System.out.println("Manipulated Unicode Characters:");
        System.out.println("Difference between A and a: " + difference);
        System.out.println("Calculated Letter C: " + letterC);
        System.out.println("Calculated Letter c: " + letterSmallC);

    }
}
