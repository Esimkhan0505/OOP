package pr4.interfaces.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pr4.interfaces.sorting.NameComparator;
import pr4.interfaces.sorting.Student2;

public class Main4 {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();

        students.add(new Student2("Alice", 3.8));
        students.add(new Student2("Bob", 3.2));
        students.add(new Student2("Charlie", 3.9));
        students.add(new Student2("Diana", 3.5));

        System.out.println("=== Original list ===");
        System.out.println(students);

        Collections.sort(students);
        System.out.println("=== Sorted by GPA ===");
        System.out.println(students);

        Collections.sort(students, new NameComparator());
        System.out.println("=== Sorted by Name ===");
        System.out.println(students);
    }
}