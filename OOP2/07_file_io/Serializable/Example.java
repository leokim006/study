package Serializable;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        String fileName = "alice.dat";

        Person p = new Person("Alice", 30);

        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
            System.out.println("객체 저장 완료: " + p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream ios = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(ios)) {
            Person pp = (Person) ois.readObject();
            System.out.println("객체 읽기 완료: " + pp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
