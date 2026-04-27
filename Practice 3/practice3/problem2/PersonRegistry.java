package practice3.problem2;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people;

    public PersonRegistry() {
        people = new Vector<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printAllPeople() {
        if (people.isEmpty()) {
            System.out.println("No people in the registry.");
            return;
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public int size() {
        return people.size();
    }
}
