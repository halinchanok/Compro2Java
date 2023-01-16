package String_ClassBasic;
import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        while (true) {
            String taxt1 = sc.nextLine();
            if (taxt1 == "") {
                break;
            }
            if (taxt1.length() > max) {
                max = taxt1.length();
                count=1;
            }else{
                count++;
            }

        }
        System.out.println(max + "\n" + (count-1));
    }
}
