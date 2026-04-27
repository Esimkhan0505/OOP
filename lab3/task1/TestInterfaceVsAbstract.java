package lab3.task1;

public class TestInterfaceVsAbstract {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 4);
        Animal bird = new Bird("Sky", 2);

        System.out.println(dog.getName() + " says " + dog.makeSound());
        System.out.println(bird.getName() + " says " + bird.makeSound());

        Flyable flyingBird = new Bird("Rio", 1);
        Flyable airplane = new Airplane("Boeing 777");

        flyingBird.fly();
        airplane.fly();
    }
}
