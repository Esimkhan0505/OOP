package lab2.problem5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Vector<Person> findPeopleWithPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public Vector<Person> findPeopleWithoutPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public void printDetails() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
