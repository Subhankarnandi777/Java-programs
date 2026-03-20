import java.util.Scanner;

class UtilityHelper {

    int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    void checkNumber(int n) {
        if(n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}

public class StudentUtilitySystem {

    public static void main(String[] args) {

        System.out.println("===== Welcome to Student Utility System =====");

        int a = 10, b = 5;

        System.out.println("Addition = " + (a + b));
        System.out.println("Multiplication = " + (a * b));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        UtilityHelper obj = new UtilityHelper();

        System.out.println("Factorial = " + obj.factorial(num));
        obj.checkNumber(num);

        if(args.length > 0) {
            int cmd = Integer.parseInt(args[0]);
            System.out.println("Command Line Input: " + cmd);
            obj.checkNumber(cmd);
        }

        sc.close();
    }
}
