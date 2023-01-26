package Array2D;

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int H = sc.nextInt();
            int W = sc.nextInt();
            boolean ck = false;
            if ((P + H - 1 <= R && Q + W - 1 <= C) && P > 0 && Q > 0) {
                for (int j = P; j < P + H; j++) {
                    for (int k = Q; k < Q + W; k++) {
                        if (arr[j][k] == 0) {
                            ck = true;
                        }
                    }
                }
                if (ck == false) {
                    for (int j = P; j < P + H; j++) {
                        for (int k = Q; k < Q + W; k++) {
                            arr[j][k] = 0;
                            sum += arr[j][k];
                        }
                    }
                }
            }

        }

        // System.out.println(sum);
    }
}
