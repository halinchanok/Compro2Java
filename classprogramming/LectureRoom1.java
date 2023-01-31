package classprogramming;

import java.util.Scanner;

class LectRoom {
    public int classCode;
    public String name;
    public int capacity;
    public int currentSeats;

    LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        currentSeats = 0;
    }

    boolean reserveSeats(int N) {
        if (currentSeats + N <= capacity) {
            currentSeats += N;
            return true;
        } else {
            return false;
        }
    }

    void print() {
        System.out.println(name);
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LectRoom[] lectroom = new LectRoom[N];
        for (int i = 0; i < N; i++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            lectroom[i] = new LectRoom(classCode, name, capacity);
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int classCode = sc.nextInt();
            int seats = sc.nextInt();
            boolean ch = false;
            for (int j = 0; j < N; j++) {
                if (lectroom[j].classCode == classCode) {
                    if (lectroom[j].reserveSeats(seats)) {
                        lectroom[j].print();
                        ch = true;
                        break;
                    }
                }
            }
            if (!ch) {
                System.out.println("sorry");
            }
            ch = false;
        }
    }
}
