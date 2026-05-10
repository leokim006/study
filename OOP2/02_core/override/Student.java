public class Student {
    private String id;
    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (o instanceof Student) {
            Student s = (Student) o;
            if (this.id.compareTo(s.id) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    /*
    int ssn;

    @Override
    public int hashCode() {
        return ssn; 
    }

    public static void main(String[] args) {
        // List<Object> list = new ArrayList<String>();
        String str = "STR";
        Integer i = 0;
        Object[] objArray = {str, i};

        for (Object obj : objArray) {
            if (obj instanceof String) {
                System.out.println("String" + obj);
            }
            if (obj instanceof Integer) {
                System.out.println("Integer" + obj);
            }
        }
    }
    */
}
