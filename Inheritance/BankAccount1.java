import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Account {
    public String name;
    public String code;
    public double balance;
    public boolean active;

    Account(String name, String code, double balance) {
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

public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account1 A = new Account1(name, code, money);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int n = scan.nextInt();
            if (n == 1) {
                A.printInfo();
            } else if (n == 2) {
                System.out.println(A.checkBalance());
            } else if (n == 3) {
                A.closeAccount();
            } else if (n == 4) {
                money = scan.nextDouble();
                System.out.println(A.deposit(money));
            } else {
                money = scan.nextDouble();
                System.out.println(A.withdrawn(money));
            }
        }
    }
}