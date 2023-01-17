package String_ClassBasic;

import java.util.Scanner;

public class ShootingString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C1 = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        while (true) {
            String str = sc.next();
            if (str.equals("Z") && count3 != 0) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == C1.charAt(0)) {
                    count1++;
                }
                count3++;
            }
        }
        String C2 = sc.next();
        while (true) {
            String str = sc.next();
            if (str.equals("Z") && count4 > 0) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == C2.charAt(0)) {
                    count2++;
                }
                count4++;
            }
        }
        int c3 = count1 + (count4 / 5);
        int c4 = count2 + (count3 / 5);
        System.out.println(count1 + " " + count4 / 5 + " " + c3);
        System.out.println(count2 + " " + count3 / 5 + " " + c4);
        if (c3 > c4) {
            System.out.println("1");
        } else if (c4 > c3) {
            System.out.println("2");
        } else
            System.out.println("0");

    }
}
