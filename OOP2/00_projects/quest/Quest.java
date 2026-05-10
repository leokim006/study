package quest;

public class Quest {
    static int nextQuestID = 1;
    int id;
    String title;
    int reward;
    boolean isCompleted;

    public Quest(String title, int reward) {
        this.id = nextQuestID++;
        this.title = title;
        this.reward = reward;
        isCompleted = false;
    }

    @Override
    public String toString() {
        return "[" + id + "]" + title +
                " / " + "보상: " + reward +
                "/" + "상태: " + (isCompleted ? "done" : "ready");
    }

    public void complete() {
        isCompleted = true;
    }

    public int getID() {
        return this.id;
    }
}
