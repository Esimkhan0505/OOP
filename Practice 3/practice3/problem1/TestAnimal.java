package practice3.problem1;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("Creating dog with constructor without parameters:");
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.eat();
        dog1.eat("meat");
        dog1.eat("meat", 2);

        System.out.println();

        System.out.println("Creating dog with constructor with parameters:");
        Dog dog2 = new Dog("Rex", 4, "Labrador");

        System.out.println("\nOverriding example:");
        dog2.makeSound();

        System.out.println("\nCalling base class method using super:");
        dog2.showParentSound();

        System.out.println("\nOverloading examples:");
        dog2.eat();
        dog2.eat("chicken");
        dog2.eat("chicken", 3);
        dog2.makeSound(2);

        System.out.println("\nObject information:");
        System.out.println(dog2);
    }
}
