import java.util.Scanner;

class Route {
    public String names[];
    public int distances[];
    public int N;

    Route(int N, String[] names, int[] distances) {
        this.N = N;
        this.names = names;
        this.distances = distances;
    }

    void getStopInfo(int k, int N) {
        if (k >= 1 && k <= N) {
            System.out.println(names[k] + " " + distances[k]);
        } else {
            System.out.println("invalid number");
        }
    }
}

public class BusRoute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = sc.next();
            distances[i] = sc.nextInt();
        }
        Route R = new Route(N, names, distances);
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int k = sc.nextInt();
            R.getStopInfo(k, N);
        }
    }
}
