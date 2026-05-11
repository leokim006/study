# Collection과 Comparable 실습 예제

## 실습 주제

학생 성적 관리 프로그램

## 학습 목표

학생들은 이 실습을 통해 다음을 배웁니다.

1. `ArrayList`로 여러 학생 객체 저장하기
2. `HashSet`으로 중복 학생 제거하기
3. `HashMap`으로 학번 기준 검색하기
4. `Comparable`로 학생 객체 정렬하기
5. `equals()`, `hashCode()`, `compareTo()`의 역할 이해하기

---

## 핵심 개념 연결

### Collection

`Collection`은 여러 데이터를 담는 자료구조입니다.

```java
List<Student> students = new ArrayList<>();
Set<Student> studentSet = new HashSet<>();
Map<String, Student> studentMap = new HashMap<>();
```

대표적으로 다음이 있습니다.

| 자료구조 | 특징 |
|---|---|
| `List` | 순서 있음, 중복 허용 |
| `Set` | 중복 허용 안 함 |
| `Map` | key-value 구조 |
| `ArrayList` | 가장 기본적인 리스트 |
| `HashSet` | 중복 제거에 자주 사용 |
| `HashMap` | 학번, 이름 같은 key로 빠르게 검색 |

---

### Comparable

`Comparable`은 객체가 자기 자신의 정렬 기준을 가지게 하는 인터페이스입니다.

예를 들어 학생을 점수 높은 순으로 정렬하고 싶다면 `Student` 클래스가 직접 기준을 정할 수 있습니다.

```java
class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student other) {
        return other.score - this.score;
    }
}
```

---

# 실습 코드

파일명:

```text
StudentCollectionComparableLab.java
```

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        // 점수 높은 순으로 정렬
        return other.score - this.score;
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

public class StudentCollectionComparableLab {
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
        Collections.sort(students);

        System.out.println();
        System.out.println("=== 2. 점수 높은 순 정렬 ===");
        for (Student student : students) {
            System.out.println(student);
        }

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
    }
}
```

---

# 예상 실행 결과

```text
=== 1. ArrayList 출력 ===
2024001 / 김민수 / 85점
2024002 / 이서연 / 92점
2024003 / 박지훈 / 78점
2024004 / 최유나 / 92점
2024005 / 정도윤 / 88점

=== 2. 점수 높은 순 정렬 ===
2024002 / 이서연 / 92점
2024004 / 최유나 / 92점
2024005 / 정도윤 / 88점
2024001 / 김민수 / 85점
2024003 / 박지훈 / 78점

=== 3. HashSet 중복 제거 ===
2024001 / 김민수 / 85점
2024002 / 이서연 / 92점

=== 4. HashMap 학번 검색 ===
2024002 학생 정보: 2024002 / 이서연 / 92점
```

`HashSet`의 출력 순서는 실행 환경에 따라 달라질 수 있습니다.

---

# 학생용 실습 문제

## 문제 1. 학생 추가하기

아래 학생을 `ArrayList`에 추가하시오.

```text
학번: 2024006
이름: 한지민
점수: 95
```

그리고 전체 학생 목록을 출력하시오.

---

## 문제 2. 정렬 기준 바꾸기

현재 코드는 점수가 높은 순서로 정렬됩니다.

```java
return other.score - this.score;
```

이 코드를 수정해서 점수가 낮은 순서로 정렬되게 하시오.

힌트:

```java
return this.score - other.score;
```

---

## 문제 3. 같은 점수일 때 이름순 정렬하기

현재는 점수가 같으면 순서가 명확하지 않습니다.

다음 기준으로 정렬되게 수정하시오.

```text
1순위: 점수 높은 순
2순위: 이름 가나다순
```

정답 예시:

```java
@Override
public int compareTo(Student other) {
    if (this.score != other.score) {
        return other.score - this.score;
    }

    return this.name.compareTo(other.name);
}
```

---

## 문제 4. HashSet 중복 기준 확인하기

다음 두 학생을 `HashSet`에 넣으면 몇 명이 저장되는지 확인하시오.

```java
studentSet.add(new Student("2024007", "홍길동", 80));
studentSet.add(new Student("2024007", "홍길순", 95));
```

질문:

```text
학번은 같고 이름과 점수가 다르면 같은 학생인가?
현재 코드에서는 왜 중복으로 처리되는가?
```

설명 포인트:

```java
return this.id.equals(other.id);
```

현재 `equals()`가 학번만 비교하기 때문입니다.

---

## 문제 5. HashMap 검색 기능 추가하기

사용자가 학번을 입력하면 해당 학생 정보를 출력하는 기능을 추가하시오.

예시:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("검색할 학번 입력: ");
String inputId = scanner.nextLine();

Student result = studentMap.get(inputId);

if (result != null) {
    System.out.println(result);
} else {
    System.out.println("학생을 찾을 수 없습니다.");
}
```

---

# 수업 설명 흐름 추천

## 1단계: `ArrayList`

먼저 학생 여러 명을 저장합니다.

```java
List<Student> students = new ArrayList<>();
```

설명:

```text
ArrayList는 여러 객체를 순서대로 저장한다.
같은 학생도 여러 번 들어갈 수 있다.
```

---

## 2단계: `Comparable`

학생 객체를 정렬합니다.

```java
Collections.sort(students);
```

이때 Java는 이렇게 질문합니다.

```text
Student끼리는 누가 앞에 와야 하지?
```

그 답을 주는 메서드가 바로 이것입니다.

```java
compareTo()
```

---

## 3단계: `HashSet`

중복 학생을 제거합니다.

```java
Set<Student> studentSet = new HashSet<>();
```

설명:

```text
HashSet은 같은 객체를 중복 저장하지 않는다.
그런데 무엇을 같은 객체로 볼지는 equals()와 hashCode()가 결정한다.
```

---

## 4단계: `HashMap`

학번으로 학생을 빠르게 찾습니다.

```java
Map<String, Student> studentMap = new HashMap<>();
```

설명:

```text
HashMap은 key-value 구조이다.
여기서는 학번이 key, 학생 객체가 value이다.
```

---

# 학생들에게 강조할 핵심 정리

```text
List:
순서가 있고 중복을 허용한다.

Set:
중복을 허용하지 않는다.

Map:
key를 이용해서 value를 찾는다.

Comparable:
객체가 자기 자신의 정렬 기준을 정한다.

equals() / hashCode():
Set이나 Map에서 객체의 중복 여부를 판단하는 데 중요하다.
```

---

# 추가 심화 과제

아래 조건을 만족하도록 코드를 수정하게 하면 좋습니다.

1. 학생 평균 점수를 출력하시오.
2. 최고 점수 학생을 출력하시오.
3. 90점 이상 학생만 출력하시오.
4. 이름순으로 정렬하시오.
5. 학번순으로 정렬하시오.
6. 점수가 같은 경우 학번순으로 정렬하시오.
7. `HashMap`을 이용해 특정 학번의 점수를 수정하시오.

특히 이 실습은 다음 단원과 자연스럽게 이어집니다.

```text
Collection
Comparable
Comparator
equals()
hashCode()
toString()
Object class
Generic
Exception
File 입출력
```

다음 단계로는 이 예제를 파일에서 학생 정보를 읽어와 Collection에 저장하는 실습으로 확장할 수 있습니다.
