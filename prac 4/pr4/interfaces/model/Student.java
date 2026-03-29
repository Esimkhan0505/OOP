package pr4.interfaces.model;

public class Student extends Person implements CanHavePizza,  Movable {

    public Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println("Student eats pizza.");
    }

    
    @Override
    public void move() {
        System.out.println("Student moves.");
    }

    @Override
    public void dance() {
        System.out.println("Student dances.");
    }
}