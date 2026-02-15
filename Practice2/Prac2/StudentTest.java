package Prac2;



public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Ali", 101);
        System.out.println(s);

        s.incrementYearOfStudy();
        System.out.println("After increment: " + s);
    }
}
