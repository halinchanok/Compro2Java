package classprogramming;

import java.util.ArrayList;
import java.util.Scanner;

class Course2 {
    String str;
    ArrayList<Integer> ID;
    int N;

    Course2(String str, int N) {
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

class Student {
    int id;
    String firstName;
    String lastName;

    Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printInfo() {

    }
}

public class Enrollment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i] = new Student(id, firstName, lastName);
        }

        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course2 co = new Course2(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }
        co.printInfo();
    }
}
