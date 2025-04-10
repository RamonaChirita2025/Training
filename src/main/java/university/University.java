package university;

public class University {

    public static void main (String [] args){

        UndergraduateStudent undergraduatestudent = new UndergraduateStudent();
        undergraduatestudent.setName("Popescu Ion");
        undergraduatestudent.setAge(20);
        undergraduatestudent.setGrade(9.1);
        System.out.println("Undergraduate student " + undergraduatestudent.getName() + ", with age " + undergraduatestudent.getAge() + " and grade " + undergraduatestudent.getGrade()+ ", has the following scholarship: " + undergraduatestudent.getScholarship() + ".");

        GraduateStudent graduatestudent = new GraduateStudent();
        graduatestudent.setName("Ionescu Maria");
        graduatestudent.setAge(24);
        graduatestudent.setGrade(8.3);
        System.out.println("Graduate student " + graduatestudent.getName() + ", with age " + graduatestudent.getAge() + " and grade " + graduatestudent.getGrade() + ", has the following scholarship: " + graduatestudent.getScholarship() + ".");

        // negative
        UndergraduateStudent undergraduatestudent1 = new UndergraduateStudent();
        undergraduatestudent1.setName("Popescu Ioana");
        undergraduatestudent1.setAge(19);
        undergraduatestudent1.setGrade(8.9);
        System.out.println("Undergraduate student " + undergraduatestudent1.getName() + ", with age " + undergraduatestudent1.getAge() + " and grade " + undergraduatestudent1.getGrade() + " has no scholarship." );

        GraduateStudent graduatestudent1 = new GraduateStudent();
        graduatestudent1.setName("Ionescu Mihai");
        graduatestudent1.setAge(20);
        graduatestudent1.setGrade(7.9);
        System.out.println("Graduate student " + graduatestudent1.getName() + ", with age " + graduatestudent1.getAge() + " and grade " + graduatestudent1.getGrade() + " has no scholarship." );
    }
}
