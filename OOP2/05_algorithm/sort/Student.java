package sort;

public class Student {
    int uid;
    String name;

    public Student(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "<uid = " + this.uid + " name: " + this.name + ">";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof Student) {
                if (this.uid == ((Student) o).uid) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.uid;
    }
}
