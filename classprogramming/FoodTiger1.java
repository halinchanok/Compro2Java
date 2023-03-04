package classprogramming;

import java.util.Scanner;

class FoodShop {
    int nFoods;
    String name;

    FoodShop(String name) {
        this.name = name;
        nFoods = 0;
    }

    boolean addFood() {
        if (nFoods < 5) {
            nFoods++;
            System.out.print(nFoods + " ");
            return true;
        } else {
            System.out.print("-1 ");
            return false;
        }
    }

    void printMenu() {
        System.out.println(name + " " + nFoods);
    }
}

public class FoodTiger1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FoodShop1[] fs = new FoodShop1[N];
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            fs[i] = new FoodShop1(name);
        }

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int s = scan.nextInt();
            boolean ret = fs[s - 1].addFood();
            System.out.println(ret);
            ;
        }

        for (int i = 0; i < N; ++i) {
            fs[i].printMenu();
            ;
        }
    }
}
