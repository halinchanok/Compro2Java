import java.util.Scanner;

public class UnderLine_With_parameter {
    private static void UnderLine(Scanner sc ,int Loop) {
        for(int i=0; i<Loop; i++){
            String taxt = sc.next();
            int n = sc.nextInt();
            System.out.println(taxt);
            for(int j=0; j<n; j++){
                System.out.print("-");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        UnderLine(sc, N);
    }
}
