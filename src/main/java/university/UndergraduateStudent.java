package university;

public class UndergraduateStudent extends Student {
    public int getScholarship() {
        if (grade > 9.0) {
            scholarship = 500;
        } else {
            scholarship = 0;
        }
        return scholarship;
    }
}
