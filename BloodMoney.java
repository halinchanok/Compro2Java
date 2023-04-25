import java.util.Scanner;

public class BloodMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sc.nextLine();
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '#') {

                } else if (str.charAt(j) == '@') {
                    System.out.print(" ");
                } else if (str.charAt(j) == '$') {
                    System.out.print(" [Blood Money $");
                } else {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("]");
        }
    }
}
