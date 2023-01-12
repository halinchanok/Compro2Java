package String_ClassBasic;

import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String taxt = sc.next();
        int count = 0;
        int ck = -1;
        for(int i=0; i<taxt.length()-2; i++){
            int value1 = (int) taxt.charAt(i);
            int value2 = (int) taxt.charAt(i+1);
            int value3 = (int) taxt.charAt(i+2);
            if(value2-1==value1 && value3-2==value1){
                if(count == 0){
                    ck = i+1;
                }
                count++;
            }
        }
        System.out.println(count);
        System.out.println(ck);
    }
}
