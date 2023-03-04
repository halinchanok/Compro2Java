package classprogramming;

import java.util.Scanner;

class FoodShop1 {
    int nFoods;
    String name;
    String menu[];

    FoodShop1(String name) {
        this.name = name;
        nFoods = 0;
        menu = new String[5];
    }

    boolean addFood(String foodName) {
        if (nFoods < 5) {
            nFoods++;
            menu[nFoods - 1] = foodName;
            System.out.print(nFoods + " ");
            return true;
        } else {
            System.out.print("-1 ");
            return false;
        }
    }

    void printMenu() {
        System.out.print(name);
        for (int i = 0; i < 5; i++) {
            if (menu[i] != null) {
                System.out.print(" " + menu[i]);
            }
        }
        System.out.println();
    }
}

public class FoodTiger2 {
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
            String foodName = scan.next();
            boolean ret = fs[s - 1].addFood(foodName);
            System.out.println(ret);
            ;
        }

        for (int i = 0; i < N; ++i) {
            fs[i].printMenu();
        }
    }
}
