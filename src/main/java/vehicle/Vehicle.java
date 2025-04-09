package vehicle;

public class Vehicle {
    String name;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String start(){
        return "Start!";
    }

    public String stop(){
        return "Stop!";
    }
    public String honkVehicle(){
        return "Honk, honk!";
    }
}
