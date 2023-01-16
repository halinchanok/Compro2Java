package String_ClassBasic;

import java.util.Scanner;

public class SpellChecking2 {
    public static void countMatch(Scanner sc, String vocab, int N) {
        String word = sc.next();
        for(int i=0; i<N; i++){
            if( )
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] vocab = new String[N];
        for(int i=0; i<N; i++){
            vocab[i] = sc.next();
        }
        int K = sc.nextInt();
        countMatch(sc, vocab, N);  
    }
}
