package university;

public class Student {
    private String name;
    private int age;
    protected int scholarship;
    protected double grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getScholarship() {
        return scholarship;
    }
}