import java.util.Scanner;

class WaterTank {
    public int capacity;
    public int volume = 0;

    WaterTank(int width, int length, int height) {
        capacity = width * length * height;
    }

    int fill(int amount) {
        if (volume + amount > capacity) {
            System.out.println("Cannot fill the tank");
            return -1;
        } else {
            volume += amount;
            return volume;
        }
    }
}

public class TankObserver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        int height = sc.nextInt();
        WaterTank tank = new WaterTank(width, length, height);

        for (int i = 0; i < 5; ++i) {
            int amount = sc.nextInt();
            System.out.println(tank.fill(amount));
        }
    }
}
