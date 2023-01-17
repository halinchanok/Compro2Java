package String_ClassBasic;

import java.util.Scanner;

public class ShootingString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        while (true) {
            String str = sc.next();
            int count = 0;
            if (str.equals("Z")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == C.charAt(0)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
