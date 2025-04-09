package employee;

public class Developer extends Employee {
    private double salary = 2500;

    @Override
    public double getSalary() {
        if (yearsOfService > 5) {
            return salary + (5 * salary) / 100;
        }
        return salary;
    }
}
