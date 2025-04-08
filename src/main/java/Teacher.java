public class Teacher extends Person {
    public String classes;

    public void introduce(){
        System.out.println("Hi, I am " + getName() + " and I teach " + classes + "!");
    }
}
