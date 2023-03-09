package Recursion;

import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
        if (str.length() <= 1) {
            return str;
        }
        if (front == true) {
            front = false;
            return str.substring(0, 1) + str.substring(str.length() - 1, str.length())
                    + goInside(str.substring(1, str.length() - 1), front);
        } else {
            front = true;
            return str.substring(str.length() - 1, str.length()) + str.substring(0, 1)
                    + goInside(str.substring(1, str.length() - 1), front);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);

    }
}
