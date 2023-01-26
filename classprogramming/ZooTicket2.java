package classprogramming;

import java.util.Scanner;

class ZooTicket3 {
    private String name;
    private int sumR;
    private int sumS;
    private int sumT;

    ZooTicket3(String name) {
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

    String useRide() {
        if (sumR == 40) {
            sumR = 0;
            return "okay\ntrue";
        } else {
            return "no\nfalse";
        }
    }

    String enterSealShow() {
        if (sumS == 50) {
            sumS = 0;
            return "okay\ntrue";
        } else {
            return "no\nfalse";
        }
    }

    String enterTigerShow() {
        if (sumT == 65) {
            sumT = 0;
            return "okay\ntrue";
        } else {
            return "no\nfalse";
        }
    }

}

public class ZooTicket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        ZooTicket3 ticket = new ZooTicket3(name);

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
        final int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            int service = sc.nextInt();
            if (service == 1) {
                System.out.println(ticket.useRide());
            } else if (service == 2) {
                System.out.println(ticket.enterSealShow());
            } else if (service == 3) {
                System.out.println(ticket.enterTigerShow());
            }
        }
    }
}
