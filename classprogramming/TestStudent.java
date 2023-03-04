package classprogramming;

import java.util.Scanner;

class Student {
    final static int NUM_TEST = 4;
    public String firstName;
    public String lastName;
    private int stepScore[];

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        stepScore = new int[5];
    }

    int getTestScore(int score) {
        int sum = 0;
        sum += score;
        if (stepScore[4] > -1) {
            return sum;
        }
    }
}

public class TestStudent {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];
        for (int i = 0; i < N; i++) {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].getTestScore(score);
            }
            // Your code: call printInfo
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int rosterNum = scan.nextInt();
            int testNum = scan.nextInt();
            System.out.println();
        }
    }
}
