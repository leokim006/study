package student;

import java.util.Comparator;

public class ComparatorScore implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getScore() - s1.getScore();
    }
}
