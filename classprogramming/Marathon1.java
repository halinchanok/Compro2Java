package classprogramming;

import java.util.Scanner;

class Runner {
    String name;
    String BIB;
    static int nRival;

    Runner(String name, int type) {
        this.name = name;
        nRival = 1;
        if (type == 1) {
            BIB = "A" + String.format(“%09d”,12345);
        } else if (type == 2) {
            BIB = "B";
        } else if (type == 4) {
            BIB = "C";
        } else {
            BIB = "D";
        }
    }

    void printInfo() {
        System.out.println(BIB + " " + name);
    }
}

public class Marathon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Runner[] R = new Runner[N + 2];
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int type = sc.nextInt();
            R[i] = new Runner(name, type);
            R[i + 1].nRival += 1;
        }
        for (int i = 1; i <= N; i++) {
            R[i].printInfo();
        }
    }
}
