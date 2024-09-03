import java.util.*;


        

public class MainProgram {
    public static void main(String[] args) {
        List<Person> data = Arrays.asList(
                new Person("John", "Doe", "123"),
                new Person("Jane", "Smith", "456"),
                new Person("Alex", "Johnson", "789")
        );

        PersonList personList = new PersonList();
        personList.store(data);
        personList.display();

        int index = personList.find("123");
        if (index != -1) {
            System.out.println("Person with ID 123 found at index: " + index);
        } else {
            System.out.println("Person with ID 123 not found.");
        }
    }
}
