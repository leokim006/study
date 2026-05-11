package student;

import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
