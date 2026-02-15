package lab1.p5;

public class Person {
    private final Gender gender;
    private final String name;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + gender + ")";
    }
}
