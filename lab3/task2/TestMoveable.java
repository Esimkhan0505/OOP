package lab3.task2;

public class TestMoveable {
    public static void main(String[] args) {
        Moveable car = new Car("Toyota");
        Swimmable fish = new Fish("Nemo");
        Swimmable boat = new Boat("Titan");

        car.move();

        fish.move();
        fish.swim();

        boat.move();
        boat.swim();
    }
}
