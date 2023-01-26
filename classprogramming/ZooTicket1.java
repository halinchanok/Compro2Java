package classprogramming;

import java.util.Scanner;

class ZooTicket1 {
    private String name;
    private int sumR;
    private int sumS;
    private int sumT;

    ZooTicket1(String name) {
        this.name = name;
        this.sumR = 0;
        this.sumS = 0;
        this.sumT = 0;
    }

    void bookRide() {
        sumR += 40;
    }

    void bookSealShow() {
        sumS += 50;
    }

    void bookTigerShow() {
        sumT += 65;
    }

    void summarize() {
        int sum = 100;
        System.out.println(name);
        if (sumR == 40) {
            System.out.println("Ride");
            sum += sumR;
        }
        if (sumS == 50) {
            System.out.println("Seal");
            sum += sumS;
        }
        if (sumT == 65) {
            System.out.println("Tiger");
            sum += sumT;
        }
        System.out.println(sum);

    }
}

public class ZooTicket1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        ZooTicket1 ticket = new ZooTicket1(name);

        while (true) {
            int service = sc.nextInt();
            if (service == 0) {
                break;
            }
            if (service == 1) {
                ticket.bookRide();
            } else if (service == 2) {
                ticket.bookSealShow();
            } else if (service == 3) {
                ticket.bookTigerShow();
            }
        }
        ticket.summarize();
    }
}
