package j0330_person;

public class Student extends Person {
    private int uid;
    private int gpa;

    public Student() {
        uid = 0;
        gpa = 4;
    }

    public String toString() {
        return super.toString() + ", " + "uid: " + uid + "gpa: " + gpa;
    }

}
