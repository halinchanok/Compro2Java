import java.util.Scanner;

class Food1 {
    public int sumPrice;
    public String name;
    public int totalprice;

    Food1(String name) {
        this.name = name;
    }

    void sumPriceOrder(int prices) {
        sumPrice += prices;
    }

    void printfOrder() {
        System.out.println(name);
        System.out.println(sumPrice);
        totalprice = sumPrice;
        if (sumPrice < 100) {
            System.out.println("10");
            totalprice += 10;
        } else if (sumPrice < 150) {
            System.out.println("20");
            totalprice += 20;
        } else {
            System.out.println("30");
            totalprice += 30;
        }
        System.out.println(totalprice);
    }

    void earnings() {
        int rider = 0;
        int grab = 0;
        int seller = 0;
        if (totalprice < 200) {
            grab += (sumPrice * 3) / 10;
            rider = 20;
            seller = totalprice - grab - 20;
        } else {
            grab += (sumPrice * 3) / 10;
            rider = 30;
            seller = totalprice - grab - 30;
        }
        System.out.println("Rider : " + rider);
        System.out.println("Grabpanda : " + grab);
        System.out.println("Seller : " + seller);
    }
}

public class Grabpanda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Food1 f = new Food1(name);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int prices = sc.nextInt();
            f.sumPriceOrder(prices);
        }
        f.printfOrder();
        f.earnings();
    }
}
