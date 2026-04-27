package lab3.task2;

public class Fish implements Swimmable {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " moves in water.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims fast.");
    }
}
