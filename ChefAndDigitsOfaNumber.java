// Chef and digits of a number

import java.lang.*;
import java.util.*;
class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int count0 = 0, count1 = 0;

            for (char s1 : s.toCharArray()) {
                if (s1 == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }

            int len = s.length();
            if (count0 == len - 1 || count1 == len - 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
