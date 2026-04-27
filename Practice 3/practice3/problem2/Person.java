package practice3.problem2;

import java.util.Objects;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name)
                && Objects.equals(address, other.address)
                && getClass().equals(other.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, getClass());
    }
}
