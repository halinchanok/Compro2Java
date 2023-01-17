package Array2D;

import java.util.Scanner;

public class ArrayExploration1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int count_positive = 0;
        int count_negative = 0;
        int count_even = 0;
        int count_odd = 0;
        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if ((r >= 1 && r <= R) && (c >= 1 && c <= C)) {
                if (arr[r][c] > 0) {
                    count_positive++;
                } else if (arr[r][c] < 0) {
                    count_negative++;
                }

                if (arr[r][c] % 2 == 0) {
                    count_even++;
                } else
                    count_odd++;
            }
        }
        System.out.print(count_positive + " ");
        System.out.print(count_negative + " ");
        System.out.print(count_even + " ");
        System.out.print(count_odd);
    }
}
