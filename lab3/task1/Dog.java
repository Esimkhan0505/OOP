package lab3.task1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
