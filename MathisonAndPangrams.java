// Mathison and pangrams

import java.util.*;
import java.lang.*;

import java.io.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int totalTests = scanner.nextInt();

        while (totalTests-- > 0) {
            int[] letterCosts = new int[26];
            for (int i = 0; i < 26; i++) {
                letterCosts[i] = scanner.nextInt();
            }

            String inputText = scanner.next();
            boolean[] presentLetters = new boolean[26];

            // Mark all letters present in the given input
            for (char ch : inputText.toCharArray()) {
                presentLetters[ch - 'a'] = true;
            }

            int extraBudgetNeeded = 0;

            // Add the cost of letters that are missing
            for (int i = 0; i < 26; i++) {
                if (!presentLetters[i]) {
                    extraBudgetNeeded += letterCosts[i];
                }
            }

            System.out.println(extraBudgetNeeded);
        }

    }
}
