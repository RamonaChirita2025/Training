package vehicle;

public class Bike extends Vehicle {
    public String start(){
        return "The bike is starting.";
    }
    public String stop(){
       return " Stop! The bike is stopped.";
    }
    public String honkBike(){
        return "Ring, ring!";
    }
}
