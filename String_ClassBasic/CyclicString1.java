package String_ClassBasic;

import java.util.Scanner;

public class CyclicString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        int count = 0;
        while (true) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                count++;
                if (count == N) {
                    break;
                }
            }
            if (count == N) {
                break;
            }
        }
    }
}
