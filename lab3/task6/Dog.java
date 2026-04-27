package lab3.task6;

public class Dog extends Pet implements Trainable, Comparable<Dog> {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String getCareInstruction() {
        return "Needs walking and attention.";
    }

    @Override
    public void train() {
        System.out.println(getName() + " is learning commands.");
    }

    @Override
    public int compareTo(Dog other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return super.toString() + "[breed=" + breed + "]";
    }
}
