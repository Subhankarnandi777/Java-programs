abstract class Accounts {
    double balance;
    int accNo;
    String name, address;

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double roi = 5;

    void withdraw(double amt) {
        balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance += balance * roi / 100;
    }
}

class AccountMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accNo = 101;
        s.balance = 1000;
        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}
