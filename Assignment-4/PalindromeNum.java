import java.util.Scanner;

class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num, rev = 0;

        while(num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
