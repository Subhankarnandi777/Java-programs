import java.util.Scanner;

class Account {
    int pin = 1234;
    double balance = 1000;

    void checkPin(int p) {
        if(p == pin)
            System.out.println("PIN Verified");
        else
            System.out.println("Wrong PIN");
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }
}

class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        System.out.print("Enter PIN: ");
        int p = sc.nextInt();
        a.checkPin(p);

        a.deposit(500);
        a.withdraw(200);
        a.showBalance();
    }
}
