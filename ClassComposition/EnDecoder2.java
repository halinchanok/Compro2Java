package ClassComposition;

import java.util.Scanner;

class Decoder {
    String[] str;
    int[] num;

    Decoder(String[] str, int[] num) {
        this.str = str;
        this.num = num;
    }

    private String decodeWord(int n) {
        for (int i = 0; i < str.length; i++) {
            if (num[i] == n) {
                return str[i];
            }
        }
        return "?";
    }

    String[] decodeMsg(int[] A) {
        String[] s = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            s[i] = decodeWord(A[i]);
        }
        return s;
    }
}

class Encoder2 {
    String[] str;
    int[] num;

    Encoder2(String[] str, int[] num) {
        this.str = str;
        this.num = num;
    }

    private int encodeWord(String s) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(s)) {
                return num[i];
            }
        }
        return -1;
    }

    int[] encodeMsg(String[] s) {
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = encodeWord(s[i]);
        }
        return a;
    }
}

public class EnDecoder2 {
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
        Encoder2 Enco = new Encoder2(str, num);
        Decoder Dec = new Decoder(str, num);
        int K = sc.nextInt();
        String[] s = new String[K];
        for (int i = 0; i < K; i++) {
            s[i] = sc.next();
        }
        int[] A = Enco.encodeMsg(s);
        String[] S = Dec.decodeMsg(A);
        for (int i = 0; i < s.length; i++) {
            System.out.print(S[i] + " ");
        }
    }
}
