import java.util.Scanner;

class Bus2 {
    public String id;
    public int type;
    private int seats;
    private int jong;
    public boolean state;

    Bus2(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.state = true;
    }

    public void printStats() {
        System.out.println(id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(jong + " " + seats);
        if (state) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

    public boolean reserve(int k) {
        if (k < 0 || k + jong > seats || state == false) {
            return false;
        } else {
            jong += k;
            return true;
        }
    }

    public void sendToRepair() {
        state = false;
    }

    public void backToService() {
        state = true;
    }
}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Bus2[] b = new Bus2[Q + 1];
        for (int i = 1; i <= Q; i++) {
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            b[i] = new Bus2(id, type, seats);
        }

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if (P == 1) {
                if (b[T].reserve(K)) {
                    System.out.println(b[T].id);
                } else {
                    System.out.println("sorry");
                }
            } else if (P == 2) {
                b[T].sendToRepair();
                System.out.println("sorry");
            } else if (P == 3) {
                b[T].backToService();
                if (b[T].state == false) {
                    System.out.println(b[T].id);
                } else {
                    System.out.println("sorry");
                }
            }
        }
    }
}
