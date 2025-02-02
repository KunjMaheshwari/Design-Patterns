

public class FactoryPatternExample {
    public static void main(String args[]){
        Vehicle car = Vehicle.getVehicle("Car");
        car.drive();

        Vehicle bike = Vehicle.getVehicle("Bike");
        bike.drive();
    }
}
