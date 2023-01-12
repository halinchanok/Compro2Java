
import java.util.Scanner;

public class UnderLine1 {
    private static void UnderLine(int N, Scanner sc) {
        for(int i=1; i<=N; i++){
            String taxt = sc.next();
            System.out.println(taxt);
            System.out.println("--------------------");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        UnderLine(N, sc);
    }
}
