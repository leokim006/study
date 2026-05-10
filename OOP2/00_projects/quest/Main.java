package quest;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Quest> list = new LinkedList<Quest>();
        Quest q1 = new Quest("슬라임 퇴치", 100);
        Quest q2 = new Quest("약초 수집", 50);

        list.add(q1);
        list.add(q2);

        for (Quest q : list) {
            if (q.getID() == 1) {
                System.out.println(q);
                break;
            }
        }

        boolean found = false;
        for (Quest q : list) {
            if (q.getID() == 1 ) {
                foud - true;
                q.complete();
                System.out.println(q);
                break;
            }
        }
        if (!found) {
            System.out.println("해당 퀘스트가 없습니다!");
        }

        for (Quest q : list) {
            System.out.println(q);
        }

        System.out.println(Quest.nextQuestID);
        Quest q3 = new Quest("장비정비", 10);
        SYstem.out.println(q3.nextQuestID);

    }
}
