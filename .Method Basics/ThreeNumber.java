import java.util.Scanner;

public class ThreeNumber {
    private static void math(int n, int min, int max, int median) {
        if (n == -1) {
            System.out.println(min);
        }
        if (n == 0) {
            System.out.println(median);
        }
        if (n == 1) {
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int median = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] != max && arr[i] != min) {
                median = arr[i];
            }
        }
        int n = sc.nextInt();
        math(n, min, max, median);
    }
}
