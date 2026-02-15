package lab1.p4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course c = new Course("CS101", "Object-oriented Programming and Design", 5, "None");

        Student[] students = {
                new Student(1, "A"), new Student(2, "B"), new Student(3, "C"),
                new Student(4, "D"), new Student(5, "E"), new Student(6, "F"),
                new Student(7, "G"), new Student(8, "H"), new Student(9, "I"),
                new Student(10, "J")
        };

        GradeBook gb = new GradeBook(c, students);
        gb.displayMessage();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease, input grades for students:");

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid. Enter integer 0..100: ");
                sc.next();
            }
            int grade = sc.nextInt();

            while (grade < 0 || grade > 100) {
                System.out.print("Out of range. Enter 0..100: ");
                grade = sc.nextInt();
            }

            gb.setGrade(i, grade);
        }

        gb.displayGradeReport();
    }
}
