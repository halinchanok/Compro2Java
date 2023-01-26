package classprogramming;

import java.util.Scanner;

class Dept {
    private int sum1;
    private int sum2;
    private int ministryBudget;
    private int eduFee;
    private int salary;
    private int electricity;
    private int cost;

    Dept(int sum1, int sum2) {
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.ministryBudget = (sum1 * 500000) + (sum2 * 3000);
        this.eduFee = sum2 * 5000;
        this.salary = sum1 * 600000;
        this.electricity = (sum1 + sum2) * 2000;
        this.cost = sum2 * 4000;
    }

    int computeIncome() {
        int sumIncome = ministryBudget + eduFee + 300000 + 100000;
        return sumIncome;
    }

    int computeExpense() {
        int sumExpense = salary + electricity + cost;
        return sumExpense;
    }

    void printReport() {
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = 300000");
        System.out.println("donation = 100000");
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + electricity);
        System.out.println("educational cost = " + cost);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = sc.nextInt();
        int sum2 = sc.nextInt();
        Dept D = new Dept(sum1, sum2);
        System.out.println("total income = " + D.computeIncome());
        System.out.println("total expense = " + D.computeExpense());
        System.out.println("income – expense = " + (D.computeIncome() - D.computeExpense()));
        D.printReport();
    }
}
