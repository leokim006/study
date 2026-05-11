package student;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. List 실습
        List<Student> students = new ArrayList<>();

        students.add(new Student("2024001", "김민수", 85));
        students.add(new Student("2024002", "이서연", 92));
        students.add(new Student("2024003", "박지훈", 78));
        students.add(new Student("2024004", "최유나", 92));
        students.add(new Student("2024005", "정도윤", 88));

        System.out.println("=== 1. ArrayList 출력 ===");
        for (Student student : students) {
            System.out.println(student);
        }

        // 2. Comparable을 이용한 정렬
        // Collections.sort(students);
        Collections.sort(students, new ComparatorName());
        Collections.reverse(students);

        System.out.println();
        System.out.println("=== 2. 점수 높은 순 정렬 ===");
        for (Student student : students) {
            System.out.println(student);
        }

        /*
        // 3. Set 실습: 중복 제거
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("2024001", "김민수", 85));
        studentSet.add(new Student("2024002", "이서연", 92));
        studentSet.add(new Student("2024001", "김민수", 85)); // 중복 학번

        System.out.println();
        System.out.println("=== 3. HashSet 중복 제거 ===");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        // 4. Map 실습: 학번으로 학생 검색
        Map<String, Student> studentMap = new HashMap<>();

        for (Student student : students) {
            studentMap.put(student.getId(), student);
        }

        System.out.println();
        System.out.println("=== 4. HashMap 학번 검색 ===");

        String searchId = "2024002";
        Student found = studentMap.get(searchId);

        if (found != null) {
            System.out.println(searchId + " 학생 정보: " + found);
        } else {
            System.out.println(searchId + " 학생을 찾을 수 없습니다.");
        }
        */
    }
}
