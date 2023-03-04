import java.util.Scanner;

class PokiStats1 {
    int hps[];
    int attks[];
    int defends[];

    PokiStats1(int[] hp, int[] attk, int[] defend) {
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

class Pokimon {
    String name;
    int level;
    int energy;
    int attack;
    int defend;
    PokiStats1 stats;

    Pokimon(PokiStats1 stats, String name, int level) {
        this.name = name;
        this.level = level;
        this.energy = stats.hps[level];
        this.stats = stats;
    }

    int attack() {
        return stats.attks[level];
    }

    int defend() {
        return stats.defends[level];
    }
}

public class Pokimon2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        // Read PokiStats
        for (int level = 1; level <= 5; ++level)
            hps[level] = scan.nextInt();
        for (int level = 1; level <= 5; ++level)
            attks[level] = scan.nextInt();
        for (int level = 1; level <= 5; ++level)
            defends[level] = scan.nextInt();
        PokiStats1 stats = new PokiStats1(hps, attks, defends);

        // Name, level and object creation
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);

        // Write output
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());

    }
}
