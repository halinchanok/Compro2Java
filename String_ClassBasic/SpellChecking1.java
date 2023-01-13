package String_ClassBasic;

import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] taxt1 = new String[N];
        String[] taxt2 = new String[10+1];
        for(int i=0; i<N; i++){
            taxt1[i] = sc.next();
        }
        for(int i=0; i<10; i++){
            taxt2[i] = sc.next();
        }
        boolean ck = false;
        for(int i=0; i<10; i++){
            for(int j=0; j<N; j++){
                boolean t = taxt2[i].equals(taxt1[j]);
                if(t==true){
                    ck = true;
                }
            }
            if(!ck){
                System.out.print("0");
            }else System.out.print("1");
            ck = false;
        }
        
    }
}
