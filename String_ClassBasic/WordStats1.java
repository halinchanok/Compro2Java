package String_ClassBasic;

import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String str = sc.next();
            arr[str.charAt(0)]++;
        }
        for(int i=65; i<=91; i++){
            if(arr[i]>0){
                System.out.print((char) i + " ");
                System.out.println(arr[i]);
            }
        }
    }
}
