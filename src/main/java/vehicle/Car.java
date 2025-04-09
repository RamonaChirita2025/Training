package vehicle;

public class Car extends Vehicle {
    public String start(){
        return "The car is starting.";
    }
    public String stop(){
        return " Stop! The car is stopped.";
    }
    public String  honkCar(){
        return "Tit, tit!";
    }
}
