package ClassComposition;

import java.util.Scanner;

class Item {
    String name, id;
    int price, shipping, volume, quan;
    boolean valid;

    public Item(String name, String id, int price, int shipping, int volume, int quan) {
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

public class ItemAndCart1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String id = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();
        Item2 item = new Item2(name, id, price, shipping, volume, quan);
        item.printInfo();

        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = scan.nextInt();
            System.out.println(item.cutStock(q));
            item.printInfo();
        }
    }
}
