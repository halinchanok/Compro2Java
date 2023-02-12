package classprogramming;

import java.util.Scanner;

class Traveler {
    public String PassportID;
    public String origin;
    public String date;
    public double T;
    public String[] county;

    Traveler(String PassportID, String origin, String date, double T) {
        this.PassportID = PassportID;
        this.origin = origin;
        this.date = date;
        this.T = T;
        county = new String[10];
        county[1] = "JAPAN";
        county[2] = "GERMANY";
        county[3] = "KOREA";
        county[4] = "CHINA";
        county[5] = "TAIWAN";
        county[6] = "FRANCE";
        county[7] = "SINGAPORE";
        county[8] = "ITALY";
        county[9] = "IRAN";
    }

    void printInfo() {
        boolean ck = false;
        System.out.print(PassportID + " ");
        for (int i = 1; i <= 9; i++) {
            if (origin.equals(county[i]) || T > 37.5) {
                ck = true;
            }
        }
        if (ck) {
            System.out.println("STATE-QUARANTINE");
        } else {
            System.out.println("SELF-QUARANTINE");
        }
    }
}

public class TravelerScreening1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Traveler[] travelea = new Traveler[N + 1];
        for (int i = 1; i <= N; i++) {
            String Passport = sc.next();
            String origin = sc.next();
            String date = sc.next();
            double T = sc.nextDouble();
            travelea[i] = new Traveler(Passport, origin, date, T);
        }
        for (int i = 1; i <= N; i++) {
            travelea[i].printInfo();
        }
    }
}
