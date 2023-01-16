package String_ClassBasic;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String C = sc.next();  
        for(int i=0; i<str.length(); i++){
            char t = str.charAt(i);
            if(C.equals(t)){
                System.out.print(str.charAt(i));
            }else{
                System.out.println();
            }
        }

    }
}
