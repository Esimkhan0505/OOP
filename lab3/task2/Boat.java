package lab3.task2;

public class Boat implements Swimmable {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " moves on the sea.");
    }

    @Override
    public void swim() {
        System.out.println(name + " floats and travels through water.");
    }
}
