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
        boolean ck = false;
        for (int i = 0; i < str.length; i++) {
            if (num[i] == n) {
                ck = true;
            }
        }
        if (ck == false) {
            return "?";
        }

    }

    decodeMsg(){

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
        Encoder Enco = new Encoder(str, num);
        Decoder Dec = new Decoder(str, num);
        int K = sc.nextInt();
        String[] s = new String[K];
        for (int i = 0; i < K; i++) {
            s[i] = sc.next();
        }
    }
}
