package String_ClassBasic;

import java.util.Scanner;

public class CutAndHide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String C = sc.next();
        int F = str.indexOf(C);
        int L = str.lastIndexOf(C);
        boolean ck = false;
        for(int i=F; i<=L; i++){
            if(C.equals(str.charAt(i)) && i!=F && i!=L){
                
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
