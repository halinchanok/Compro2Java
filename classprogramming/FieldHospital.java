package classprogramming;

import java.util.Scanner;

class FieldManager {
    public int N;
    public int[] jong;

    FieldManager(int N) {
        this.N = N;
        jong = new int[N + 1];
    }

    int reserveBed() {
        for (int i = 1; i <= N; i++) {
            if (jong[i] == 0) {
                jong[i] = 1;
                return i;
            }
        }
        return -1;
    }

    boolean discharge(int A) {
        if (jong[A] == 1) {
            System.out.println("Patient discharged");
            jong[A] = 0;
            return true;
        } else {
            System.out.println("Invalid bed number ");
            return false;
        }
    }

    void reportBed() {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (jong[i] == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FieldManager fm = new FieldManager(N);

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if (K == 1) {
                int bad = fm.reserveBed();
                if (bad == -1) {
                    System.out.println("No bed vacancy");
                } else {
                    System.out.println("Bed " + bad + " reserved");
                }
            } else if (K == 2) {
                fm.discharge(A);
            } else {
                fm.reportBed();
            }
        }
    }
}
