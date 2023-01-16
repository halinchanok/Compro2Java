package String_ClassBasic;

import java.util.Scanner;

public class CharRange2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char t1 = sc.next().charAt(0);
        char t2 = sc.next().charAt(0);
        char t3 = sc.next().charAt(0);
        char t4 = sc.next().charAt(0);
        char t5 = sc.next().charAt(0);
        char t6 = sc.next().charAt(0);
        String str = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        boolean ck = false;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if((c>=t1 && c<=t2) || (c>=t2 && c<=t1)){
                count1++;
                ck = true;
            }
            if((c>=t3 && c<=t4) || (c>=t4 && c<=t3)){
                count1++;
                ck = true;
            }
            if((c>=t5 && c<=t6) || (c>=t6 && c<=t5)){
                count1++;
                ck = true;
            }
            if(ck == false){
                count2++;
            }else count3++;
            ck = false;
        }
        System.out.println(count3);
        System.out.println(count2);
        System.out.println(count1 - (count2*2));
    }
}
