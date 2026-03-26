import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean prime = true;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime && num > 1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
