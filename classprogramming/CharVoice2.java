package classprogramming;

import java.util.Scanner;

class Character2 {
    private String msg[];
    private int Index;

    Character2(String[] msg) {
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

public class CharVoice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        Character2[] crt = new Character2[C + 1];

        for (int j = 1; j <= C; j++) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for (int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            crt[j] = new Character2(msg);
        }
        int K = scan.nextInt();
        for (int i = 1; i <= K; i++) {
            int k = scan.nextInt();
            crt[k].speak();
        }
    }
}
