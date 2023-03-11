package classprogramming;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String str;
    ArrayList<Integer> ID;
    int N;

    Course(String str, int N) {
        this.str = str;
        this.N = N;
        ID = new ArrayList<Integer>();
    }

    boolean enroll(int id) {
        boolean ck = true;
        for (int i = 0; i < ID.size(); i++) {
            if (id == ID.get(i) || ID.size() >= N) {
                ck = false;
            }
        }
        if (!ck) {
            return false;
        } else {
            ID.add(id);
            return true;
        }
    }

    void printInfo() {
        System.out.println(str + " " + ID.size());
        for (int i = 0; i < ID.size(); i++) {
            if (ID.get(i) != 0)
                System.out.println(ID.get(i));
        }
    }
}

public class Enrollment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
