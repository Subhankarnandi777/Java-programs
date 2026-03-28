class Emp {
    int id;
    String name;
}

class Dept extends Emp {
    String deptName;
    int deptCode;
}

class Salary extends Dept {
    double basic, allowance;

    void totalSalary() {
        double total = basic + allowance;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + deptName);
        System.out.println("Total Salary: " + total);
    }
}

class EmpDeptMain {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.id = 1;
        s.name = "Rahul";
        s.deptName = "IT";
        s.basic = 20000;
        s.allowance = 5000;

        s.totalSalary();
    }
}
