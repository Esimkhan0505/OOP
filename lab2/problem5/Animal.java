package lab2.problem5;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age
                + ", sound=" + getSound() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return age == other.age && Objects.equals(name, other.name)
                && getClass().equals(other.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}
