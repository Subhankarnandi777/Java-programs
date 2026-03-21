import java.util.Scanner;

class ReverseNumberProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int reverse = 0;

        while(num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}
