import java.util.Scanner;

class PokiStats {
    int hps[];
    int attks[];
    int defends[];

    PokiStats(int[] hp, int[] attk, int[] defend) {
        hps = new int[6];
        attks = new int[6];
        defends = new int[6];
        for (int i = 1; i <= 5; i++) {
            hps[i] = hp[i];
            attks[i] = attk[i];
            defends[i] = defend[i];
        }
    }
}

public class Pokimon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PokiStats1[] poki = new PokiStats1[N];

        // Read inputs for each PokiStats
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        for (int i = 0; i < N; ++i) {
            for (int level = 1; level <= 5; ++level)
                hps[level] = scan.nextInt();
            for (int level = 1; level <= 5; ++level)
                attks[level] = scan.nextInt();
            for (int level = 1; level <= 5; ++level)
                defends[level] = scan.nextInt();

            poki[i] = new PokiStats1(hps, attks, defends);
        }

        // Write outputs
        for (int i = 0; i < N; ++i) {
            PokiStats1 p = poki[i];
            for (int level = 1; level <= 5; ++level)
                System.out.print(p.hps[level] + " ");
            System.out.println();

            for (int level = 1; level <= 5; ++level)
                System.out.print(p.attks[level] + " ");
            System.out.println();

            for (int level = 1; level <= 5; ++level)
                System.out.print(p.defends[level] + " ");
            System.out.println();

        }
    }
}