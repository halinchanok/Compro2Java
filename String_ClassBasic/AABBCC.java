package String_ClassBasic;

import java.util.Scanner;

public class AABBCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int value2 = 0;
        int count =1; 
        int max = 0;
        for(int i=0; i<text.length(); i++){            
            int value1 = (int) text.charAt(i);
            if(value1==value2 || value1-1==value2){
                count++;
                if(count > max){
                    max = count;
                }
            }else count=1;
            value2 = value1;
        }
        System.out.println(max);
    }
}
