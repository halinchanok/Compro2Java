package classprogramming;

import java.util.Scanner;

class Food2 {
    public String foodName;
    public String content1;
    public int w1;
    public int cal1;

    Food2(String foodName, String content1, int w1, int cal1) {
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
        this.cal1 = w1 * cal1;
    }

    void addContent(String content2, int w2, int cal2) {
        content1 += " " + content2;
        w1 += w2;
        cal1 += w2 * cal2;
    }

    void printInfo() {
        System.out.println(foodName);
        System.out.println(w1 + " " + cal1);
        System.out.print(content1 + " ");
    }
}

public class FoodContents2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int cal1 = scan.nextInt();
        Food2 f = new Food2(foodName, content1, w1, cal1);

        int q = scan.nextInt();

        while (q != 0) {
            if (q == 1) {
                f.printInfo();
            } else if (q == 2) {
                String content2 = scan.next();
                int w2 = scan.nextInt();
                int cal2 = scan.nextInt();
                f.addContent(content2, w2, cal2);
            }
            q = scan.nextInt();
        }
    }
}
