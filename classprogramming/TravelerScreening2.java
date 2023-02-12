package classprogramming;

import java.util.ArrayList;
import java.util.Scanner;

class Traveler2 {
    public String PassportID;
    public String origin;
    public String date;
    public double T;
    public String[] county;

    Traveler2(String PassportID, String origin, String date, double T) {
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

    boolean printInfo() {
        boolean ck = false;
        for (int i = 1; i <= 9; i++) {
            if (origin.equals(county[i]) || T > 37.5) {
                ck = true;
            }
        }
        return ck;
    }
}

public class TravelerScreening2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Traveler2[] travelea = new Traveler2[N + 1];
        ArrayList<String> STATE = new ArrayList<String>();
        ArrayList<String> SELF = new ArrayList<String>();
        for (int i = 1; i <= N; i++) {
            String Passport = sc.next();
            String origin = sc.next();
            String date = sc.next();
            double T = sc.nextDouble();
            travelea[i] = new Traveler2(Passport, origin, date, T);
        }
        for (int i = 1; i <= N; i++) {
            travelea[i].printInfo();
            if (travelea[i].printInfo()) {
                STATE.add(travelea[i].PassportID + " " + travelea[i].date);
            } else {
                SELF.add(travelea[i].PassportID + " " + travelea[i].date);
            }
        }
        System.out.println(STATE.size());
        for (int i = 0; i < STATE.size(); i++) {
            System.out.println(STATE.get(i));
        }
        System.out.println(SELF.size());
        for (int i = 0; i < SELF.size(); i++) {
            System.out.println(SELF.get(i));
        }
    }
}
