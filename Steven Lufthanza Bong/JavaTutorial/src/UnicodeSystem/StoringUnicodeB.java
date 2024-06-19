package UnicodeSystem;

public class StoringUnicodeB {
        public static void main(String[] args) {
            char letterA = '\u0041';
            char letterSigma = '\u03A3';
            char copyrightSymbol = '\u00A9';
            char letterZ = 'Z';
            char letterOmega = 'Ω';
            char registeredSymbol = '®';
            System.out.println("Stored Unicode Characters using Escape Sequences:");
            System.out.println("Letter A: " + letterA);
            System.out.println("Greek Capital Letter Sigma: " + letterSigma);
            System.out.println("Copyright Symbol: " + copyrightSymbol);
            System.out.println("\nStored Unicode Characters Directly:");
            System.out.println("Letter Z: " + letterZ);
            System.out.println("Greek Capital Letter Omega: " + letterOmega);
            System.out.println("Registered Symbol: " + registeredSymbol);
        }
}
