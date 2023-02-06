package classprogramming;

import java.util.Scanner;

class Bus {
    String id;
    public int type;
    public int seats;
    public int sum;

    Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        sum = 0;
    }

    public void printStats() {
        System.out.println(id);
        if (type == 1)
            System.out.println("Fan");
        if (type == 2)
            System.out.println("P1");
        if (type == 3)
            System.out.println("VIP");

        System.out.print(sum + " ");
        if (sum + seats <= 60) {
            sum += seats;
            System.out.println(seats);
            System.out.println("Active");
        } else {
            System.out.println(seats);
            System.out.println("Inactive");
        }

    }
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int type = sc.nextInt();
        int seats = sc.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
