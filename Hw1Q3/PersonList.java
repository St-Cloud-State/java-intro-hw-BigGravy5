import java.util.*;

class PersonList {
    private LinkedList<Person> linkedList;

    public PersonList() {
        linkedList = new LinkedList<>();
    }

    public void store(List<Person> personList) {
        linkedList.addAll(personList);
    }

    public void display() {
        for (Person person : linkedList) {
            System.out.println(person);
        }
    }

    public int find(String sid) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}