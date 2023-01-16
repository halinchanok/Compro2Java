package String_ClassBasic;

import java.util.Scanner;

public class CharLotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[12];
        for(int i=0; i<12; i++){
            word[i] = sc.next();
        }
        int count2 = 0;
        for(int i=0; i<6; i++){
            String t = sc.next();
            char c1 = t.charAt(0);
            char c2 = t.charAt(1);
            int count = 0;
            for(int j=0; j<12; j++){
                char c3 = word[j].charAt(0);
                char c4 = word[j].charAt(1);
                if(c1==c3 && c2==c4){
                    count++;
                }
            }
            System.out.print(count + " ");
            count2+=count;
        }
        System.out.println();
        System.out.println(count2);
    }
}
