package String_ClassBasic;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String C = sc.next();  
        boolean ck = false;
        for(int i=0; i<str.length(); i++){
            if(ck){
                System.out.println();
            }
            char t = str.charAt(i);
            if(str.charAt(i) == C.charAt(0)){
                ck = true;
                continue;
            }else{
                System.out.print(str.charAt(i));
                
            }
            
        }

    }
}
