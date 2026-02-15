package Prac2;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; // default старт
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", year=" + yearOfStudy + "}";
    }
}
