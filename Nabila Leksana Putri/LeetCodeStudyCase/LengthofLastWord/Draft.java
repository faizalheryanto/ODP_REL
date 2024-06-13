package LengthofLastWord;

import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String testString = sc.nextLine();

        Draft solution = new Draft();
        Object[] result = solution.lengthOfLastWord(testString);

        String lastWord = (String) result[0];
        int length = (int) result[1];

        System.out.println("Last word: " + lastWord);
        System.out.println("Length of last word: " + length);
    }

    public Object[] lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return new Object[]{"", 0};
        }

        String[] parts = s.split("\\s+");
        String lastWord = parts[parts.length - 1];
        return new Object[]{lastWord, lastWord.length()};
    }
}