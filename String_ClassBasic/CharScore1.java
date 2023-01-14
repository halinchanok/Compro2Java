package String_ClassBasic;

import java.util.Scanner;

public class CharScore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum1 = 0;
        for(int i=0; i<str.length()/2; i++){
            sum1+=str.charAt(i)-64;
        }
        int sum2 = 0;
        for(int i=str.length()/2; i<str.length(); i++){
            sum2+=str.charAt(i)-64;
        }
        System.out.println(sum1 + "\n" + sum2);
    }
}
