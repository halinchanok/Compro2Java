package ClassComposition;

import java.util.Scanner;

class Cart {
    int capacity, sumItem = 0;
    Item2 item;
    int sumPrice;

    Cart(int capacity, Item2 item) {
        this.capacity = capacity;
        this.item = item;
    }

    void printStats() {
        sumPrice = sumItem * item.shipping;
        System.out.println(sumItem + " " + item.price + " " + sumPrice + " " + (item.price + sumPrice));
    }

    boolean adjustQuan(int q) {
        if (item.cutStock(q) == true && q > 0) {
            sumItem += q;
        } else if (item.cutStock(q) == false && sumItem - q >= 0) {
            sumItem += q;
        }
        return item.cutStock(q);
    }
}

class Item2 {
    String name, id;
    int price, shipping, volume, quan;
    boolean valid;

    public Item2(String name, String id, int price, int shipping, int volume, int quan) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.shipping = shipping;
        this.volume = volume;
        this.quan = quan;
        basicCheck(name, id, price, shipping, volume);
    }

    public boolean basicCheck(String name, String id, int price, int shipping, int volume) {
        if (name.length() >= 3 && id.length() >= 3 && name != null && id != null &&
                price > 0 && shipping >= 0 && volume > 0) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;

    }

    public boolean cutStock(int q) {
        if (q > quan) {
            return false;
        } else {
            quan -= q;
            return true;
        }
    }

    void printInfo() {
        System.out.println(name + " " + id + " " + price);
        System.out.print(shipping + " " + volume + " " + quan + " ");
        System.out.println(basicCheck(name, id, price, shipping, volume));
    }
}

public class ItemAndCart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String id = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();
        Item2 item = new Item2(name, id, price, shipping, volume, quan);
        int capacity = scan.nextInt();
        Cart cart = new Cart(capacity, item);

        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = scan.nextInt();
            System.out.println(cart.adjustQuan(q));
            cart.printStats();
        }
    }
}
