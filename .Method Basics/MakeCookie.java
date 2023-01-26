import java.util.Scanner;

public class MakeCookie {
    static void calCookieBags(int flour, int butter) {
        int sum_f = flour / 6;
        int sum_b = butter / 3;
        if (flour >= 0 && flour <= 100000 && butter >= 0 && butter <= 100000) {
            if (sum_f < sum_b) {
                int sum = sum_f;
                System.out.println("Cookie bags: " + sum);
                System.out.println("Flour left: " + (flour - (sum * 6)));
                System.out.println("Butter left: " + (butter - (sum * 3)));
            } else {
                int sum = sum_b;
                System.out.println("Cookie bags: " + sum);
                System.out.println("Flour left: " + (flour - (sum * 6)));
                System.out.println("Butter left: " + (butter - (sum * 3)));
            }
        } else {
            if ((butter < 0 || butter > 100000) && (flour < 0 || flour > 100000)) {
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: Invalid");
            } else if (flour < 0 || flour > 100000) {
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: " + butter);
            } else if (butter < 0 || butter > 100000) {
                System.out.println("Cookie bags: Error");
                System.out.println("Flour left: " + flour);
                System.out.println("Butter left: Invalid");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flour = sc.nextInt();
        int butter = sc.nextInt();
        calCookieBags(flour, butter);
    }
}
