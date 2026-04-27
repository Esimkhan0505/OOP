package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        if (canOwnPet(pet)) {
            this.pet = pet;
        } else {
            System.out.println(getName() + " cannot own this pet: " + pet);
        }
    }

    public Animal removePet() {
        Animal removedPet = pet;
        pet = null;
        return removedPet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public Animal getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public boolean canOwnPet(Animal pet) {
        return true;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        Animal currentPet = pet;

        if (!caretaker.canOwnPet(currentPet)) {
            System.out.println(caretaker.getName() + " cannot take care of " + currentPet);
            return;
        }

        removePet();
        caretaker.assignPet(currentPet);
        System.out.println(name + " left pet with " + caretaker.getName());
    }

    public void returnPetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            Animal returnedPet = caretaker.removePet();
            assignPet(returnedPet);
            System.out.println(name + " received pet back from " + caretaker.getName());
        } else {
            System.out.println(caretaker.getName() + " has no pet to return.");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age
                + ", occupation=" + getOccupation()
                + ", pet=" + pet + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name)
                && getClass().equals(other.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}
