package Inheritance;

import java.util.Scanner;

class Product2 {
    String name;
    String sku;
    double prices;
    int weight;
    boolean valid;

    Product2(String name, String sku, double prices, int weight) {
        this.name = name;
        this.sku = sku;
        this.prices = prices;
        this.weight = weight;
        valid = true;
    }

    boolean checkValidity() {
        if (name == "" || name.length() < 0) {
            System.out.println("name is invalid");
            valid = false;
        }
        if (sku == "" || sku.length() < 0) {
            System.out.println("sku is invalid");
            valid = false;
        }
        if (prices < 0) {
            System.out.println("price is invalid");
            valid = false;
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            valid = false;
        }
        return valid;
    }

    void printInfo() {
        System.out.print(name + ", " + sku + ", " + prices + ", " + weight);
        if (!valid) {
            System.out.print(", Invalid");
        }
        System.out.println("");
    }
}

class Shoe extends Product2 {
    int gender;
    int size;
    int type;
    String brand;

    Shoe(int gender, int size, int type, String brand, String name, String sku, double prices, int weight) {
        super(name, sku, prices, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }

    void printInfo() {
        super.printInfo();

        if (gender == 1) {
            System.out.print("female");
        } else
            System.out.print("male");

        System.out.print(", " + size + ", ");

        if (type == 1)
            System.out.print("sport, " + brand);
        else if (type == 2)
            System.out.print("formal, " + brand);
        else
            System.out.print("casual, " + brand);
        System.out.println();
    }
}

public class ProductStore2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Product2[] P = new Product2[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine();
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            P[i] = new Shoe(gender, size, type, brand, name, sku, prices, weight);
        }

        for (int i = 0; i < N; ++i) {
            boolean valid = P[i].checkValidity();
            System.out.println(valid);
        }

        for (int i = 0; i < N; ++i) {
            P[i].printInfo();
        }
    }
}
