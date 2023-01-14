package String_ClassBasic;

import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int X1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        int countX = 0;
        int countY = 0;
        int count_out = 0;
        for(int i=0; i<N; i++){
            if(arr[i]>=X1 && arr[i]<=X2){
                countX++;
            }
            if(arr[i]>=Y1 && arr[i]<=Y2){
                countY++;
            }
            if((arr[i]<X1 || arr[i]>X2) && (arr[i]<Y1 || arr[i]>Y2)){
                count_out++;
            }
        }
        System.out.println(countX);
        System.out.println(countY);
        System.out.println(count_out);

    }
}
