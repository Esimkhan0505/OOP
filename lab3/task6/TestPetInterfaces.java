package lab3.task6;

public class TestPetInterfaces {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3, "Labrador");

        System.out.println(dog);
        dog.train();

        Dog clonedDog = (Dog) dog.clone();
        System.out.println("Cloned: " + clonedDog);
    }
}
