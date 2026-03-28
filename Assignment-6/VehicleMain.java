class Vehicle {
    String regNo, brand;
}

class Engine extends Vehicle {
    String type;
    int capacity;
}

class Car extends Engine {
    double fuel, distance;

    void efficiency() {
        double eff = distance / fuel;

        System.out.println("Reg No: " + regNo);
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + type);
        System.out.println("Efficiency: " + eff);
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.regNo = "WB1234";
        c.brand = "Tata";
        c.type = "Petrol";
        c.distance = 200;
        c.fuel = 10;

        c.efficiency();
    }
}
