import java.util.Scanner;

class Team {
    // Enter your code here.
}

public class AoSU2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] members = new String[];
        if(________) {
        members = new ________;
        for(int i = 0; i < N; ++i) {
        String name = scan.next();
        int hp = scan.nextInt();
        int attkType = scan.nextInt();
        int attkDmg = scan.nextInt();
        int phyDef = scan.nextInt();
        int magDef = scan.nextInt();
        ________ = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
        }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}
