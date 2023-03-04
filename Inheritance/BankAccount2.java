import java.util.Scanner;

class Account1 {
    String name;
    String code;
    double balance;
    boolean active;

    Account1(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        if (active)
            System.out.println(name + ", " + code + ", " + balance + ", active");
        else
            System.out.println(name + ", " + code + ", " + balance + ", inactive");
    }

    double checkBalance() {
        return balance;
    }

    void closeAccount() {
        active = false;
        printInfo();
    }

    boolean deposit(double money) {
        if (active) {
            balance += money;
            System.out.print(balance + " ");
            return true;
        } else {
            return false;
        }
    }

    boolean withdrawn(double money) {
        if (active && balance >= money) {
            balance -= money;
            System.out.print(balance + " ");
            return true;
        } else {
            return false;
        }
    }
}

class Saving extends Account1 {
    public String id;
    public String tel;
    public boolean promptPay;

    public Saving(String name, String code, double balance) {
        super(name, code, balance);
        promptPay = false;
        System.out.println("Saving account");
    }

    boolean openPromptPay(int subMenu, String number) {
        if (subMenu == 1) {
            if (number.length() == 13) {
                id = number;
                return true;
            } else
                return false;
        } else {
            if (number.length() == 10) {
                tel = number;
                return true;
            } else
                return false;
        }
    }

    void printInfo() {
        if (!promptPay) {
            System.out.println(name + ", " + code + ", " + balance + ", active");
            System.out.println("PromptPay, " + id + ", " + tel);
        } else {
            System.out.println(name + ", " + code + ", " + balance + ", inactive");
            System.out.println("no PromptPay");
        }

    }
}

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account1 A = new Account1(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int menu = scan.nextInt();
            if (menu == 1) {
                A.printInfo();
            } else if (menu == 2) {
                System.out.println(A.checkBalance());
            } else if (menu == 3) {
                A.closeAccount();
            } else if (menu == 4) {
                money = scan.nextDouble();
                System.out.println(A.deposit(money));
            } else if (menu == 5) {
                money = scan.nextDouble();
                System.out.println(A.withdrawn(money));
            } else if (menu == 6) {
                int subMenu = scan.nextInt();
                String number = scan.nextLine().strip();
                System.out.println(A.openPromptPay(subMenu, number));
            }
        }
    }
}