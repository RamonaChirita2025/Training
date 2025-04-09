package vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setColor("yellow");
        vehicle.setName("Bee");
        System.out.println("Vehicle " + vehicle.getName() + " " + vehicle.getColor() + " at the red light does: " + vehicle.stop());
        System.out.println("Vehicle " + vehicle.getName() + " " + vehicle.getColor() + " at the green light does: " + vehicle.start());
        System.out.println("Vehicle " + vehicle.getName() + " " + vehicle.getColor() + " does: " + vehicle.honkVehicle());

        Car car = new Car();
        car.setColor("blue");
        car.setName("KIA");
        System.out.println("The car " + car.getName() + " " + car.getColor() + " at the red light does: " + car.stop());
        System.out.println("The car " + car.getName() + " " + car.getColor() + " at the green light does: " + car.start());
        System.out.println("The car " + car.getName() + " " + car.getColor() + " does: " + car.honkCar());

        Bike bike = new Bike();
        bike.setColor("red");
        bike.setName("Trek");
        System.out.println("The bike" + bike.getName() + " " + bike.getColor() + " at the red light does: " + bike.stop());
        System.out.println("The bike" + bike.getName() + " " + bike.getColor() + " at the green light does: " + bike.start());
        System.out.println("The bike" + bike.getName() + " " + bike.getColor() + " does: " + bike.honkBike());
    }
}
