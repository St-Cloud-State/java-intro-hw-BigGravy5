import java.io.*;
import java.util.*;

public class MyMain {
    public static void store(List<Person> personList, LinkedList<Person> linkedList) {
        linkedList.addAll(personList);
    }

    public static void display(LinkedList<Person> linkedList) {
        for (Person person : linkedList) {
            System.out.println(person);
        }
    }

    public static int find(String sid, LinkedList<Person> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Person> data = Arrays.asList(
                new Person("John", "Doe", "123"),
                new Person("Jane", "Smith", "456"),
                new Person("Alex", "Johnson", "789")
        );

        LinkedList<Person> personList = new LinkedList<>();
        store(data, personList);
        display(personList);

        int index = find("123", personList);
        if (index != -1) {
            System.out.println("Person with ID 123 found at index: " + index);
        } else {
            System.out.println("Person with ID 123 not found.");
        }
    }
}