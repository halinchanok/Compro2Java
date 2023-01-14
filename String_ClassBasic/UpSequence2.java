package String_ClassBasic;

import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int B = str.charAt(0);
        System.out.print(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(B < str.charAt(i)){
                System.out.print(str.charAt(i));
            }else{
                System.out.println();  
                System.out.print(str.charAt(i));  
            }
            B = str.charAt(i);
        }
    }
}
