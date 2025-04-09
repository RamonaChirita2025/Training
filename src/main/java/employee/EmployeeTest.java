package employee;

public class EmployeeTest {
    public static void main (String [] args){

        Developer developer = new Developer();
        developer.setYearsOfService(6);
        System.out.println("The salary for a developer with " + developer.getYearsOfService() + " years of service in the company is: " + developer.getSalary());
        developer.setYearsOfService(4);
        System.out.println("The salary for a developer with " + developer.getYearsOfService() + " years of service in the company is: " + developer.getSalary());

        Manager manager = new Manager();
        manager.setYearsOfService(6);
        System.out.println("The salary for a manager with " + manager.getYearsOfService() + " years of service in the company is: " + manager.getSalary());
        manager.setYearsOfService(4);
        System.out.println("The salary for a manager with " + manager.getYearsOfService() + " years of service in the company is: " + manager.getSalary());
    }
}
