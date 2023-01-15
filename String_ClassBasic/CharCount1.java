package String_ClassBasic;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[92];
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;  
        }
        for(int i=65; i<=91; i++){
            if(arr[i]>0){
                System.out.print((char) i + " ");
                System.out.println(arr[i]);
            }
        }
    }
}
