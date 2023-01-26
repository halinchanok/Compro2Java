import java.util.Scanner;

public class Encoding_Alphabet_with_Number {
    static void taxt(int n, int i, String str, char num) {
        if (num > 90) {
            char c = (char) (str.charAt(i) + n - 26);
            System.out.print(c);
        } else {
            char c = (char) (str.charAt(i) + n);
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            int n = sc.nextInt();
            char num = (char) (str.charAt(i) + n);
            taxt(n, i, str, num);
        }

    }
}
