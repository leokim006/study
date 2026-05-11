package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// public class Student implements Comparable<Student> {
class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int score;

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /*
     * Comparable의 핵심 메서드
     *
     * this와 other를 비교해서 정렬 순서를 결정한다.
     *
     * 반환값이 음수이면 this가 앞에 온다.
     * 반환값이 양수이면 other가 앞에 온다.
     * 반환값이 0이면 같은 순서로 본다.
     */
    @Override
    public int compareTo(Student other) {
        // 이름 순 정렬
        return this.name.compareTo(other.name);

        // id 순 정렬
        // return this.id.compareTo(other.id);
    }

    /*
     * HashSet에서 중복 여부를 판단할 때 사용된다.
     * 여기서는 학번이 같으면 같은 학생으로 본다.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;
        return this.id.equals(other.id);
    }

    /*
     * equals()를 오버라이드하면 hashCode()도 함께 오버라이드해야 한다.
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /*
     * 객체를 출력할 때 보기 좋은 문자열로 바꿔준다.
     */
    @Override
    public String toString() {
        return id + " / " + name + " / " + score + "점";
    }
}
