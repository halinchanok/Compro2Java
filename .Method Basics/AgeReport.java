import java.util.Scanner;

public class AgeReport {
    static void reportAge() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ID = new int[N];
        int[] Age = new int[N];
        for (int i = 0; i < N; i++) {
            ID[i] = sc.nextInt();
            Age[i] = sc.nextInt();
        }
        reportAge();

    }
}
