package String_ClassBasic;

import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        String c3 = sc.next();
        String str = sc.next();
        int N = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n > 0 && n <= str.length()) {
                if ((int) str.charAt(n - 1) == (int) c1.charAt(0)) {
                    count1++;
                }
                if ((int) str.charAt(n - 1) == (int) c2.charAt(0)) {
                    count2++;
                }
                if ((int) str.charAt(n - 1) == (int) c3.charAt(0)) {
                    count3++;
                }
            } else
                count4++;
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
    }

}
