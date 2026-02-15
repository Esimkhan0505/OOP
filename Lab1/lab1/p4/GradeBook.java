package lab1.p4;

import practice2.Student;

public class GradeBook {
    private final Course course;
    private final Student[] students;
    private final int[] grades;

    public GradeBook(Course course, Student[] students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.length];
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void setGrade(int index, int grade) {
        if (index < 0 || index >= grades.length) return;
        if (grade < 0 || grade > 100) return;
        grades[index] = grade;
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int min = getMinimum();
        int max = getMaximum();
        int minIndex = indexOf(min);
        int maxIndex = indexOf(max);

        System.out.println("\nClass average is " + avg +
                ". Lowest grade is " + min + " (" + students[minIndex] + ")." +
                "\nHighest grade is " + max + " (" + students[maxIndex] + ").\n");

        outputBarChart();
    }

    private double determineClassAverage() {
        int sum = 0;
        for (int g : grades) sum += g;
        return (grades.length == 0) ? 0 : (double) sum / grades.length;
    }

    private int getMinimum() {
        int min = 100;
        for (int g : grades) if (g < min) min = g;
        return min;
    }

    private int getMaximum() {
        int max = 0;
        for (int g : grades) if (g > max) max = g;
        return max;
    }

    private int indexOf(int grade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == grade) return i;
        }
        return 0;
    }

    private void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] freq = new int[11]; // 0-9, 10-19, ... 100

        for (int g : grades) {
            int bucket = g / 10;
            if (bucket > 10) bucket = 10;
            freq[bucket]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int star = 0; star < freq[i]; star++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students.length + "}";
    }
}
