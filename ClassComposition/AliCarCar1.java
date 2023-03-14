package ClassComposition;

import java.util.Scanner;

class Car {
    String name;
    int price;
    int labor;
    int id;

    Car(String name, int price, int labor) {
        this.name = name;
        this.price = price;
        this.labor = labor;
    }

    static boolean check(String name, int price, int labor) {
        if (name != null && name.length() != 0 && price > 0 && labor > 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[1001];
        int sum = 1;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();

            if (cars[i].check(name, price, labor) == true) {
                cars[sum] = new Car(name, price, labor);
                sum++;
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

        for (int i = 1; i < sum; i++) {
            System.out.println(i + " " + cars[i].name);
        }

    }
}