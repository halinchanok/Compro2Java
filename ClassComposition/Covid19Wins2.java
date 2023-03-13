package ClassComposition;

import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void ddVisitation(Visitation v) {

    }

    void printAllVisitations() {

    }
}

class Visitation {
    int id, date;
    int[] time;

    Visitation(int id, int date) {
        this.id = id;
        this.date = date;
        time = new int[24];
    }

    void visit(int k) {
        if (k < 0 || k > 23) {
            System.out.println("invalid hour: " + k);
        } else {
            time[k]++;
        }
    }

    int count() {
        int cnt = 0;
        for (int i = 0; i <= 23; i++) {
            if (time[i] > 0) {
                cnt += time[i];
            }

        }
        return cnt;
    }

    void printVisitHours() {
        System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        if (count() == 0) {
            System.out.println("no visit");
        } else {
            for (int i = 0; i <= 23; i++) {
                if (time[i] > 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

public class Covid19Wins2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();
        for (int i = 0; i < P; i++) {
            int p = scan.nextInt();
            String str = scan.next();
        }
        String name = scan.next();
        Person p = new Person(name);
        int N = scan.nextInt();
        Visitation[] v = new Visitation[N];
        for (int i = 0; i < N; i++) {
            int id = scan.nextInt();
            int date = scan.nextInt();
            final int K = scan.nextInt();
            v[i] = new Visitation(id, date);
            for (int j = 0; j < K; j++) {
                int k = scan.nextInt();
                v[i].visit(k);
            }
        }

        v.printVisitHours();
    }
}
