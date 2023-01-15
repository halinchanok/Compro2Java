package String_ClassBasic;

import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<str.length(); i++){
            Character t =  (char) str.charAt(i);
            if(Character.isUpperCase(t)){
                count1++;
            }else if(Character.isLowerCase(t)){
                count2++;
            }else{
                count3++;
            }
        }
        System.out.println(count2);
        System.out.println(count1);
        System.out.println(count3);
        
    }
}
