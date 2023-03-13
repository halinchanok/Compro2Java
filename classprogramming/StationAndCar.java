package classprogramming;

import java.util.Scanner;

class Station {
    int benzin, diesel;
    Car car;

    Station(int benzin, int diesel) {
        this.benzin = benzin;
        this.diesel = diesel;
    }

    void dispense(int gasType) {
        if (gasType == 1) {
            if()
            refillBenzin(car.getNeededVol());
        }else{
            refillDiesel(car.getNeededVol());
        }
    }

    void refillBenzin(int C) {
        benzin += C;
        System.out.println("Station has " + benzin + " liters of benzin");
    }

    void refillDiesel(int C) {
        diesel += C;
        System.out.println("Station has " + diesel + " liters of diesel");
    }
}

class Car {
    int gasType, C, D;
    Station station;

    Car(int B, int C, int D) {
        this.gasType = B;
        this.C = C;
        this.D = D;
        station.dispense(gasType);
    }

    int getNeededVol() {
        return C - D;
    }
}

public class StationAndCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station s = new Station(benzin, diesel);

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            Car c = new Car(B, C, D);
        }
    }
}
