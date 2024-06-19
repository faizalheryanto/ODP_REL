package UnicodeSystem;

public class StoringUnicodeC {

    public static void main(String[] args) {
        char letterA = '\u0041';
        char letterSmallA = '\u0061';
        char letterB = 'B';

        int difference = letterA - letterSmallA;
        char letterC = (char) (letterB + difference);
        char letterSmallC = (char) (letterC + 32);
        System.out.println("Manipulated Unicode Characters:");
        System.out.println("Difference between A and a: " + difference);
        System.out.println("Calculated Letter C: " + letterC);
        System.out.println("Calculated Letter c: " + letterSmallC);
    }




}
