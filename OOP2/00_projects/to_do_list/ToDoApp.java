import java.util.ArrayList;
import java.util.Scanner;

// 할 일(ToDo) 1개의 정보를 담는 객체입니다.
class ToDo {
    int id; // 고유 ID
    String content; // 할 일 내용

    // 생성자: 새로운 할 일을 만들 때 ID와 내용을 설정해 줍니다.
    public ToDo(int id, String content) {
        this.id = id;
        this.content = content;
    }
}

public class ToDoApp {
    public static void main(String[] args) {
        // 데이터 저장소: 할 일들을 저장할 ArrayList를 만듭니다. (HashMap은 절대 사용하지 않습니다!)
        ArrayList<ToDo> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 테스트를 위해 미리 임시 데이터를 몇 개 넣어둡니다.
        todoList.add(new ToDo(101, "자바 과제 제출"));
        todoList.add(new ToDo(102, "수학 퀴즈 준비"));
        todoList.add(new ToDo(103, "동아리 회의 참석"));

        System.out.println("=== 스마트 할 일 관리 앱 (ArrayList 버전) ===");

        while (true) {
            System.out.println("\n1. 할 일 추가  2. ID로 할 일 검색  3. 전체 할 일 보기  4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // 엔터키 처리

            if (choice == 1) {
                // [할 일 추가 기능]
                System.out.print("새로운 할 일의 고유 ID를 입력하세요 (숫자): ");
                int newId = scanner.nextInt();
                scanner.nextLine(); // 엔터키 처리
                
                System.out.print("할 일 내용을 입력하세요: ");
                String newContent = scanner.nextLine();
                
                // 새로운 ToDo 객체를 만들어서 ArrayList의 맨 끝에 추가합니다.
                todoList.add(new ToDo(newId, newContent));
                System.out.println("-> 할 일이 성공적으로 추가되었습니다!");

            } else if (choice == 2) {
                // [ID로 검색 기능] - ★ 여기가 ArrayList의 한계를 보여주는 핵심 부분입니다!
                System.out.print("\n검색할 할 일의 ID를 입력하세요: ");
                int searchId = scanner.nextInt();
                boolean found = false;

                // ArrayList는 인덱스 번호만 알기 때문에, 0번부터 끝까지 하나씩 전부 열어봐야 합니다. (순차 탐색)
                for (int i = 0; i < todoList.size(); i++) {
                    ToDo currentTask = todoList.get(i);
                    
                    // 내가 찾던 ID와 현재 열어본 할 일의 ID가 일치하는지 비교합니다.
                    if (currentTask.id == searchId) {
                        System.out.println("-> 찾았습니다! 내용: " + currentTask.content);
                        found = true;
                        break; // 찾았으니 더 이상 찾을 필요 없이 반복문을 빠져나옵니다.
                    }
                }

                // 리스트를 처음부터 끝까지 다 뒤졌는데도 못 찾았다면
                if (!found) {
                    System.out.println("-> 일치하는 ID가 없습니다.");
                }

            } else if (choice == 3) {
                // [전체 목록 출력 기능]
                System.out.println("\n[전체 할 일 목록]");
                // ArrayList에 있는 모든 할 일을 처음부터 끝까지 순서대로 꺼내옵니다.
                for (int i = 0; i < todoList.size(); i++) {
                    ToDo t = todoList.get(i);
                    System.out.println("ID: " + t.id + " | 내용: " + t.content);
                }

            } else if (choice == 4) {
                // [종료]
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 선택해 주세요.");
            }
        }
        
        scanner.close();
    }
}

