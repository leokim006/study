package sort;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetLab {
    public static void main(String[] args) {
        Set<Student> set = new LinkedHashSet<>();
        Student s1 = new Student(20260001, "A");
        Student s2 = new Student(20260002, "B");
        Student s3 = new Student(20260003, "C");

        Student s11 = new Student(20260001, "A1");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s11);

        System.out.println(s1.equals(s11));
        System.out.println(set);
    }
}
