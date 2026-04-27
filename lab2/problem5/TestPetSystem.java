package lab2.problem5;

public class TestPetSystem {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 20, "Finance");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 4);

        john.assignPet(murka);
        alice.assignPet(rex); // should not be allowed
        bob.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("Initial state:");
        registry.printDetails();

        System.out.println("\nBob tries to leave dog with Alice:");
        bob.leavePetWith(alice);

        System.out.println("\nJohn leaves cat with Alice:");
        john.leavePetWith(alice);

        System.out.println("\nAfter vacation transfer:");
        registry.printDetails();

        System.out.println("\nJohn returns and takes cat back:");
        john.returnPetFrom(alice);

        System.out.println("\nFinal state:");
        registry.printDetails();
    }
}
