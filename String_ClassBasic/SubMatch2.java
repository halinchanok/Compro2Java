package String_ClassBasic;

import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String check = sc.next();
        for(int i=0; i<check.length()-2; i++){
            String c = check.substring(i, i+3);
            if(str.indexOf(c) != -1){
                System.out.println(str.indexOf(c)+1);
            }else System.out.println("No"); 
        }
    }
}
