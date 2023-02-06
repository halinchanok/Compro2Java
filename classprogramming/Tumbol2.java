package classprogramming;

import java.util.Scanner;

class Tumbol3 {
    public String name;
    public int id1;
    public int id2;
    public int sum;
    public int availBudget;

    Tumbol3(String name, int x, int y, int population) {
        this.name = name;
        this.id1 = x;
        this.id2 = y;
        this.sum = population;
        availBudget = population * 5000;
    }

    void allocateBudget(int[] budget) {
        boolean ck = false;
        for (int i = 0; i < budget.length; i++) {
            if (budget[i] <= availBudget) {
                availBudget -= budget[i];
                System.out.print(i + 1 + " ");
                ck = true;
            }
        }
        System.out.println();
        if (!ck) {
            System.out.println("none");
        }
    }
}

public class Tumbol2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Tumbol3[] tumbols = new Tumbol3[k];
        for (int i = 0; i < k; ++i) {
            String name = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int population = sc.nextInt();
            tumbols[i] = new Tumbol3(name, x, y, population);
        }

        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = sc.nextInt();
            int[] budget = new int[N];
            for (int j = 0; j < N; j++) {
                budget[i] = sc.nextInt();
            }
            tumbols[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}
