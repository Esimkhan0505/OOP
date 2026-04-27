package lab3.task6;

import java.io.Serializable;

public abstract class Pet implements Soundable, Serializable, Cloneable {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getCareInstruction();

    public String getName() {
        return name;
    }

    @Override
    public Pet clone() {
        try {
            return (Pet) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age
                + ", sound=" + makeSound()
                + ", care=" + getCareInstruction() + "]";
    }
}
