package classprogramming;

import java.util.Scanner;

class Character {
    private String msg[];
    private int Index;

    Character(String[] msg) {
        this.msg = msg;
        Index = 0;
    }

    void speak() {
        System.out.println(msg[Index]);
        if (Index >= msg.length - 1) {
            Index = 0;
        } else
            Index++;
    }
}

public class CharVoice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] msg = new String[N];
        scan.nextLine(); // Skip end-line char
        for (int i = 0; i < N; ++i) {
            msg[i] = scan.nextLine();
        }
        Character crt = new Character(msg);
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            crt.speak();
        }
    }
}
