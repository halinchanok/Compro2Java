package classprogramming;

import java.util.Scanner;

class House2 {
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price;

    House2(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = 0;
        computePrice(landSize, quality, floors, houseArea);
    }

    void computePrice(int landSize, int quality, int floors, int houseArea) {
        price = (landSize * 10000);
        if (floors == 2) {
            price += 200000;
        } else if (floors == 3) {
            price += 400000;
        } else if (floors == 4) {
            price += 600000;
        }

        if (quality == 1) {
            price += houseArea * 10000;
        } else if (quality == 2) {
            price += houseArea * 8000;
        } else if (quality == 3) {
            price += houseArea * 5000;
        }
    }
}

public class HousePrice2 {
    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        House2[] h = new House2[N + 1];
        for (int i = 1; i <= N; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            h[i] = new House2(landSize, quality, floors, houseArea);
        }
        int priceMax = scan.nextInt();
        int Area = scan.nextInt();
        boolean ck = false;
        for (int i = 1; i <= N; i++) {
            if ((h[i].price < priceMax) && (h[i].houseArea >= Area)) {
                System.out.println(h[i].landSize + " " + h[i].quality + " " + h[i].floors + " " + h[i].houseArea + " "
                        + h[i].price);
                ck = true;
            }
        }
        if (!ck) {
            System.out.println("none");
        }

    }
}
