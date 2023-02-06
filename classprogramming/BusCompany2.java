
import java.util.Scanner;

class Bus1 {
    public String id;
    public int type;
    public int seats;
    public int sum;
    public boolean ck;

    Bus1(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        sum = 0;
        ck = false;
    }

    public void printStats() {
        System.out.println(id);
        if (type == 1)
            System.out.println("Fan");
        if (type == 2)
            System.out.println("P1");
        if (type == 3)
            System.out.println("VIP");
        System.out.println(sum + " " + seats);
        if (reserve(seats) == true) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

    boolean reserve(int K) {
        if (K + sum < seats && K >= 0 && ck == false) {
            sum += K;
            ck = true;
            return true;
        } else {
            ck = false;
            return false;
        }
    }

    void sendToRepair() {
        ck = false;
    }

    void backToService() {
        ck = true;
    }

}

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int type = sc.nextInt();
        int seats = sc.nextInt();
        Bus1 b = new Bus1(id, type, seats);

        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = sc.nextInt();
            int K = sc.nextInt();
            if (P == 1)
                b.reserve(K);
            else if (P == 2)
                b.sendToRepair();
            else if (P == 3)
                b.backToService();
            b.printStats();
        }

    }
}
