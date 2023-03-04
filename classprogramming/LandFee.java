package classprogramming;

import java.util.Scanner;

class Bill {
    public String PIN;
    public String saleDate;
    public int size;
    public int price;
    public double tax;
    public double fee;
    public double stamp;

    Bill(String PIN, String saleDate, int size, int price) {
        this.PIN = PIN;
        this.saleDate = saleDate;
        this.size = size;
        this.price = price;
        tax = (price * 3 * size) / 100;
        fee = (price * 5 * size) / 100;
        stamp = (price * 1 * size) / 100;
    }

    void printInfo() {
        System.out.println(PIN + " " + saleDate + " " + size + " " + price);
        System.out.println(tax + "+" + fee + "+" + stamp + "=" + (tax + fee + stamp));
    }
}

public class LandFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Bill[] B = new Bill[N];

        for (int i = 0; i < N; i++) {
            String PIN = sc.next();
            String saleDate = sc.next();
            int size = sc.nextInt();
            int price = sc.nextInt();
            B[i] = new Bill(PIN, saleDate, size, price);
        }
        for (int i = 0; i < N; i++) {
            B[i].printInfo();
        }
    }
}
