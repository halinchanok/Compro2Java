package Array2D;

import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        if ((P + H - 1 > R || Q + W - 1 > C) || P <= 0 || Q <= 0) {
            System.out.println("invalid input");
        } else {
            for (int i = P; i < P + H; i++) {
                for (int j = Q; j < Q + W; j++) {
                    arr[i][j] = 1;
                }
            }
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
