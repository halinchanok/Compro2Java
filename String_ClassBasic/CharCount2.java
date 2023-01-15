package String_ClassBasic;

import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];
        int count = 0;
        while(true){
            String str = sc.next();
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)]++;  
                for(int j=65; j<=91; j++){
                if(arr[j]==N){
                    System.out.println((char) j);
                    System.out.println(count+1);
                    System.exit(0);
                }
            }
            }
            count++;
        }
    }
}
