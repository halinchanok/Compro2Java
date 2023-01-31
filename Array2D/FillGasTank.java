package Array2D;

import java.util.Scanner;

public class FillGasTank {
    public int[][] arr;
    public int sum;

    FillGasTank(int[][] arr) {
        this.arr = arr;
        sum = 0;
    }

    static void fuelCost(String c, int p1, int p2) {
        if ("L".equals(c)) {
            sum = ((arr[p1][p2] * 350) / 60);
            System.out.println(sum);
        }
        if ("M".equals(c)) {
            sum = ((arr[p1][p2] * 270) / 60);
            System.out.println(sum);
        }
        if ("S".equals(c)) {
            sum = ((arr[p1][p2] * 200) / 60);
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        FillGasTank fill = new FillGasTank(arr);
        int P = sc.nextInt();
        for (int i = 0; i < P; i++) {
            String c = sc.next();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            fill.fuelCost(c, p1, p2);
        }
    }
}
