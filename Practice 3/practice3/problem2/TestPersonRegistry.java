package practice3.problem2;

public class TestPersonRegistry {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(new Person("Person One", "Address 1"));
        registry.addPerson(new Student("Student One", "Address 2", "IT", 1, 10000));
        registry.addPerson(new Staff("Staff One", "Address 3", "University", 250000));

        registry.printAllPeople();
    }
}
