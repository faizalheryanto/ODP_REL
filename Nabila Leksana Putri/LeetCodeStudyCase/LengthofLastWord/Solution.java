package LengthofLastWord;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String testString = sc.nextLine();

        Solution solution = new Solution();
        int lastWordLength = solution.lengthOfLastWord(testString);

        System.out.println("Length of last word: " + lastWordLength);
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String[] parts = s.split("\\s+");
        String lastWord = parts[parts.length - 1];
        return lastWord.length();
    }

}
