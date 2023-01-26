package classprogramming;

import java.util.Scanner;

class Route3 {
    public String names[];
    public int distances[];
    public int N;

    Route3(int N, String[] names, int[] distances) {
        this.N = N;
        this.names = names;
        this.distances = distances;
    }

    void getTripInfo(int k1, int k2) {
        int sum = 0;
        if ((k1 <= N && k1 >= 1 && k2 >= 1 && k2 <= N) && k1 < k2) {
            for (int i = k1 + 1; i <= k2; i++) {
                sum += distances[i];
            }
            System.out.println(names[k1] + " " + names[k2] + " " + sum);
        } else {
            System.out.println("invalid number");
        }

    }
}

public class BusRoute3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = sc.next();
            distances[i] = sc.nextInt();
        }
        Route3 R = new Route3(N, names, distances);
        final int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            R.getTripInfo(k1, k2);
        }

    }
}
