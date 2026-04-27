package lab3.task1;

public class Airplane implements Flyable {
    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " is flying.");
    }
}
