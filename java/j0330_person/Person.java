package j0330_person;

public class Person {
    String name;
    int id;

    public Person() {
        name = "Hong";
        id = 1234;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getty
    String getName() {
        return this.name;
    }
    int getId() {
        return this.id;
    }

    // setty
    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }

    // toString()
    public String toString() {
        return "Name:" + this.name + ", ID: " + this.id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(!(obj instanceof Person)) {
            return false;
        }
        // Person p2 = obj; // is error. cause obj != Person
        Person p2 = (Person)obj;

        if ((this.name.compareTo(p2.name) == 0) && (this.id == p2.id)) {
            return true;
        }

        return false;
    }
    
    // hashCode()? although if two obj is different, make two obj same hashcode
    // firstly call hashCode to compare hash values, and call equals when hash is equal
    public int hashCode() {
        String key = "key";
        // return id + name.hashCode() + key.hashCode();
        return id;
    }

    /*
    public int hashCode(){
        int result = 17;
        result = 31 * result 
    }
    */
}
