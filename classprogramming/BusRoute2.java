package classprogramming;

import java.util.Scanner;

class Route2 {
    public String names[];
    public int distances[];
    public int N;

    Route2(int N, String[] names, int[] distances) {
        this.N = N;
        this.names = names;
        this.distances = distances;
    }

    void summarizeRoute(int sum) {
        System.out.println(names[1] + " " + names[N] + " " + sum);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            names[i] = sc.next();
            distances[i] = sc.nextInt();
            sum += distances[i];
        }
        Route2 R = new Route2(N, names, distances);
        R.summarizeRoute(sum);

    }
}
