package String_ClassBasic;

import java.util.Scanner;

public class CharInRange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char t1 = sc.next().charAt(0);
        char t2 = sc.next().charAt(0);
        char t3 = sc.next().charAt(0);
        char t4 = sc.next().charAt(0);
        char t5 = sc.next().charAt(0);
        char t6 = sc.next().charAt(0);
        boolean ck = false;
        for(int i=0; i<3; i++){
            char c = sc.next().charAt(0);
            if((c>=t1 && c<=t2) || (c>=t2 && c<=t1)){
                System.out.print("1 ");
                ck = true;
            }
            if((c>=t3 && c<=t4) || (c>=t4 && c<=t3)){
                System.out.print("2 ");
                ck = true;
            }
            if((c>=t5 && c<=t6) || (c>=t6 && c<=t5)){
                System.out.print("3");
                ck = true;
            }
            if(ck == false){
                System.out.println("0");
            }System.out.println();
            ck = false;
        }
    }
}
