package String_ClassBasic;

import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String str_max = "";
        String str_min = "";
        while(true){
            String str = sc.next();
            if(str.length() == 0){
                break;
            }
            if(str.length() > max){
                max = str.length();
                str_max = str;
            }
            if(str.length() < min){
                min = str.length();
                str_min = str;
            }
            String t = sc.nextLine();
        }
        if(n==1){
            System.out.println(max);
            System.out.println(str_max);
        }else{
            System.out.println(min);
            System.out.println(str_min);
        }
    }
}
