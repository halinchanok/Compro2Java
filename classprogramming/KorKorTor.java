package classprogramming;

import java.util.Scanner;

class Party {
    public String name;
    public int member;
    public Scanner sc;
    public String firstname[];
    public String lastname[];
    public int number[];

    Party(String name, int member) {
        this.name = name;
        this.member = member;

    }

    Party(Scanner sc) {
        this.sc = sc;
        firstname = new String[member + 1];
        lastname = new String[member + 1];
        number = new int[member + 1];
        for (int i = 1; i <= member; i++) {
            firstname[i] = sc.next();
            lastname[i] = sc.next();
            this.number[i] = sc.nextInt();
        }
    }

    void printInfo(int regionNumber) {
        if (regionNumber == 0) {
            for (int i = 1; i < member; i++) {
                System.out.println(firstname[i] + " " + lastname[i] + " " + number[i]);
            }
        } else {
            for (int i = 1; i < member; i++) {
                if (number[i] == regionNumber) {
                    System.out.println(firstname[i] + " " + lastname[i]);
                }
            }
        }
    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Party[] party = new Party[N + 1];
        for (int i = 1; i <= N; i++) {
            String name = scan.next();
            int member = scan.nextInt();
            party[i] = new Party(name, member);
        }
        for (int i = 1; i <= N; i++) {
            party[i] = new Party(scan);
        }
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }

    }
}
