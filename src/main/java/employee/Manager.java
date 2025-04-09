package employee;

public class Manager extends Employee {
    private double salary = 3000.0;

    @Override
    public double getSalary() {
        if(yearsOfService > 5) {
            return salary + (10 * salary) / 100;
        }
        return  salary;
    }
}
