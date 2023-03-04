package classprogramming;

import java.util.ArrayList;
import java.util.Scanner;

class Runner {
    String name[];
    int BIB[];
    static ArrayList<String> id;

    Runner(String[] name, int[] BIB) {
        this.name = name;
        this.BIB = BIB;
        id = new ArrayList<String>();
        int n = 1;
        for (int i = 0; i < BIB.length; i++) {
            if (BIB[i] == 1) {
                id.add('A' + String.format("%03d", n));
                n++;
            } else if (BIB[i] == 2) {
                id.add('B' + String.format("%03d", n));
                n++;
            } else if (BIB[i] == 3) {
                id.add('C' + String.format("%03d", n));
                n++;
            } else if (BIB[i] == 4) {
                id.add('D' + String.format("%03d", n));
                n++;
            } else {
                id.add("INVALID");
            }
        }
    }

    void printInfo() {
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i) == "INVALID") {
                System.out.println(id.get(i));
            } else {
                System.out.println(id.get(i) + " " + name[i]);
            }
        }
    }
}

public class Marathon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String name[] = new String[N];
        int BIB[] = new int[N];
        for (int i = 0; i < N; i++) {
            name[i] = sc.next();
            BIB[i] = sc.nextInt();
        }
        Runner R = new Runner(name, BIB);
        R.printInfo();
    }
}
