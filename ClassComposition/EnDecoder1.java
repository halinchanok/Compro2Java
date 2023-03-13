package ClassComposition;

import java.util.Scanner;

class Encoder {
    String[] str;
    int[] num;

    Encoder(String[] str, int[] num) {
        this.str = str;
        this.num = num;
    }

    private int encodeWord(String s) {
        boolean ck = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(s)) {
                ck = true;
                return num[i];
            }
        }
        return -1;
    }

    int encodeMsg(String[] s) {
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = encodeWord(s[i]);
        }
        return a;
    }
}

public class EnDecoder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        Encoder Enco = new Encoder(str, num);
        int K = sc.nextInt();
        String[] s = new String[K];
        for (int i = 0; i < K; i++) {
            s[i] = sc.next();
        }
        Enco.encodeMsg(s);

    }
}
