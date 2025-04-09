public class Main {

    public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.setName("Ramona");
    System.out.println("Teacher's name is: " + teacher.getName());

    Student student = new Student();
    student.setName("Vasile");
    System.out.println("Student's name is: " + student.getName());

    teacher.age = 30;
    System.out.println("Teacher's age is: " + teacher.age);

    teacher.personality = "intovertit";
    System.out.println("Teacher's personality is: " + teacher.personality);

    teacher. classes = "math";
    System.out.println("Teacher's class is: " + teacher.classes);

    student.grades = 9.5;
    System.out.println("Student's grade is : " + student.grades);

    teacher.introduce();

    }
}


