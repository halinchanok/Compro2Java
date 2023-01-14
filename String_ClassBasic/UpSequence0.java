package String_ClassBasic;

import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = 0;
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            if(n<b){
                System.out.println(b + " ");
            }else if(n==b || i==N-1){
                System.out.println(n + " ");
            }
            b=n;
        }
    }
}
