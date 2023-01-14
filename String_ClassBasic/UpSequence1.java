package String_ClassBasic;

import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int B = str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(B >= str.charAt(i)){ 
                System.out.println((char) B);  
            }
            if(i==str.length()-1){
                System.out.println((char) str.charAt(i));
            }
            B = str.charAt(i);
        }
    }
}
