package Array2D;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;
    boolean valid;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
        if (size != 16 && size != 18 && size != 20 && size != 22 && size != 24) {
            System.out.println("invalid size");
            valid = false;
        }
        if (number != 3 && number != 4 && number != 5) {
            System.out.println("invalid number of blades");
            valid = false;
        }
        if (angle != 27 && angle != 30 && angle != 33) {
            System.out.println("invalid angle");
            valid = false;
        }
        if (hp < 0) {
            System.out.println("invalid horsepower");
            valid = false;
        }
    }

    void printInfo() {
        System.out.println(size + " " + number + " " + angle + " " + hp + " " + valid);
    }
}

public class FanCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numb = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
    }
}
