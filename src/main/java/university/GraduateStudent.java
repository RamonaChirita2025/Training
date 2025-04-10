package university;

public class GraduateStudent extends Student {
    public int getScholarship() {
        if (grade > 8.0) {
            scholarship = 700;
        } else {
            scholarship = 0;
        }
        return scholarship;
    }
}
