package String_ClassBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class CharPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        String str = sc.next();
        String c = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == c.charAt(0)) && (str.charAt(i + 1) == c.charAt(1))
                    && (str.charAt(i + 2) == c.charAt(2))) {
                arr.add(c);
                i += 2;
                continue;
            } else {
                String s = String.valueOf(str.charAt(i));
                arr.add(s);
            }

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
