package String_ClassBasic;

import java.util.Scanner;

public class StringPresence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        String taxt = sc.next();
        boolean ck = false;
        for (int i = 0; i < N; i++) {
            if (taxt.indexOf(str[i]) != -1) {
                System.out.print(str[i] + " ");
                ck = true;
            }
        }
        if (!ck) {
            System.out.println("none");
        }
    }
}
