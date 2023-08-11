class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

class VehicleClassifierApp{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Demonstrate start and stop behavior of each class
        vehicle.start();
        vehicle.stop();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}
