import java.util.Scanner;

class BinDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(dec));

        System.out.print("Enter binary number: ");
        String bin = sc.next();
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Decimal = " + decimal);
    }
}
