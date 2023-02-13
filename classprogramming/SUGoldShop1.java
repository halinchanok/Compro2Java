package classprogramming;

import java.util.Scanner;

class Item {
    public boolean type;
    public double weight;
    public double pricegold;

    Item(boolean type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    Item() {
    }

    saleprice(){
        
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t"))
                arrayx[i] = new Item(true, weight);
            else
                arrayx[i] = new Item(false, weight);
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }
    }
}
