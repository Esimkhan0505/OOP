package practice3.problem1;

public class Animal {
    private String name;
    private int age;

    public Animal() {
        this.name = "Unknown animal";
        this.age = 0;
        System.out.println("Animal constructor without parameters was called.");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor with parameters was called.");
    }

    public void makeSound() {
        System.out.println(name + " makes some sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void eat(String food, int amount) {
        System.out.println(name + " is eating " + amount + " portions of " + food + ".");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + ", age=" + age + "]";
    }
}
