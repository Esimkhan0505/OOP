package practice3.problem1;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown breed";
        System.out.println("Dog constructor without parameters was called.");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor with parameters was called.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(getName() + " barks: Woof!");
        }
    }

    public void showParentSound() {
        super.makeSound();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog[name=" + getName() + ", age=" + getAge() + ", breed=" + breed + "]";
    }
}
