import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basic;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    void display() {
        double gross = basic + (0.2 * basic);
        System.out.println("Gross Salary = " + gross);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.display();
    }
}
