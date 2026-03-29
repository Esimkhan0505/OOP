package pr4.interfaces.main;

import pr4.interfaces.model.Cat;
import pr4.interfaces.model.Student;
import pr4.interfaces.services.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student("Esim");

        restaurant.servePizza(cat);
        restaurant.servePizza(student);

       
        student.move();
        student.dance();
    }
}