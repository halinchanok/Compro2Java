package Inheritance;

import java.util.Scanner;

class Product {
    public String name;
    public String sku;
    public double prices;
    public int weight;
    public boolean ck;

    Product(String name, String sku, double prices, int weight) {
        this.name = name;
        this.sku = sku;
        this.prices = prices;
        this.weight = weight;
        ck = true;
    }

    boolean checkValidity() {
        if (name == "" || name.length() < 0) {
            System.out.println("name is invalid");
            ck = false;
        }
        if (sku == "" || sku.length() < 0) {
            System.out.println("sku is invalid");
            ck = false;
        }
        if (prices < 0) {
            System.out.println("price is invalid");
            ck = false;
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            ck = false;
        }
        if (!ck) {
            return false;
        } else {
            return true;
        }
    }

    void printInfo() {
        System.out.print(name + ", " + sku + ", " + prices + ", " + weight);
        if (!ck) {
            System.out.println(", Invalid");
        } else
            System.out.println();
    }
}

public class ProductStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        boolean valid = true;
        Product[] P = new Product[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            P[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            valid = P[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            P[i].printInfo();
            // if (!valid) {
            // System.out.println(", Invalid");
            // } else {
            // System.out.println();
            // }
        }
    }
}
