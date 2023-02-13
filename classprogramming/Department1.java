package classprogramming;

import java.util.Scanner;

class Dept {
    private int sum1;
    private int sum2;
    private int ministryBudget;
    private int eduFee;
    private int serviceFee;
    private int donation;

    Dept(int sum1, int sum2) {
        this.sum1 = sum1;
        this.sum2 = sum2;
    }

    void computeIncome() {
        System.out.println("ministry budget = " + ((sum1 * 500000) + (sum2 * 3000)));
        System.out.println("education fee = " + sum2 * 5000);
        System.out.println("service fee = 300000");
        System.out.println("donation = 100000");
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = sc.nextInt();
        int sum2 = sc.nextInt();
        Dept D = new Dept(sum1, sum2);
        D.computeIncome();
    }
}
