package classprogramming;

import java.util.Scanner;

class Character {
    public String[] T;
    public int cnt;

    Character(String[] str) {
        this.T = str;
        cnt = 1;
    }

    void speak() {
        if (cnt > T.length) {
            cnt = 1;
        }
        System.out.println(T[cnt]);
        cnt++;
    }
}

public class CharVoice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.nextLine();
        }
        Character c = new Character(str);
        int g = sc.nextInt();
        for (int j = 0; j < g; j++) {
            c.speak();
        }
    }
}
