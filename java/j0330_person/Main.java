package j0330_person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();

        System.out.println("Person: " + p1);
        System.out.println("Student: " + s1); // Student class doesn't have toString. So, call Person's toString cause it's extended
        
    }
}
