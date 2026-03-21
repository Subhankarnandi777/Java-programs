import java.util.Scanner;

class BinaryDecimalConversionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(decimal));

        System.out.print("Enter binary number: ");
        String binary = sc.next();
        int dec = Integer.parseInt(binary, 2);
        System.out.println("Decimal = " + dec);

        sc.close();
    }
}
