package String_ClassBasic;

import java.util.Scanner;

public class CardPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = 0;
        int t2 = 0;
        for(int i=0; i<5; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            if(str1.charAt(0) > str1.charAt(1)){
                t1 = str1.charAt(0);
            }else t1 = str1.charAt(1);

            if(str2.charAt(0) > str2.charAt(1)){
                t2 = str2.charAt(0);
            }else t2 = str2.charAt(1);

            if(t1==t2){
                System.out.print("D");
            }else if(t1>t2){
                System.out.print("L");
            }else System.out.print("W");
        }

     }
}

