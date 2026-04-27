package lab3.task1;

public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Tweet";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
