package classprogramming;

import java.util.Scanner;

class FieldManager {
    public int N;
    public int sum;

    FieldManager(int N) {
        this.N = N;
    }

    int reserveBed() {

    }

    boolean discharge() {

    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FieldManager fm = new FieldManager(N);

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            ???
        }
    }
}
