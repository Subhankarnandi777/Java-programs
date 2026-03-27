class EmployeeBase {
    int id;
    String name;
    double basic;

    EmployeeBase(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
}

class Manager extends EmployeeBase {
    double allowance = 5000;

    Manager(int id, String name, double basic) {
        super(id, name, basic);
    }

    void salary() {
        System.out.println("Manager Salary = " + (basic + allowance));
    }
}

class Developer extends EmployeeBase {
    double bonus = 3000;

    Developer(int id, String name, double basic) {
        super(id, name, basic);
    }

    void salary() {
        System.out.println("Developer Salary = " + (basic + bonus));
    }
}

class PayrollMain {
    public static void main(String[] args) {
        Manager m = new Manager(1,"Rahul",40000);
        Developer d = new Developer(2,"Amit",35000);

        m.salary();
        d.salary();
    }
}
