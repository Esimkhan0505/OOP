package lab3.task3;

public class TestMyCollection {
    public static void main(String[] args) {
        MyCollection<String> names = new MyArrayCollection<>();

        names.add("Ali");
        names.add("Dana");
        names.add("Miras");

        System.out.println(names);
        System.out.println("Contains Dana: " + names.contains("Dana"));
        System.out.println("Size: " + names.size());

        names.remove("Dana");

        System.out.println(names);
        System.out.println("Is empty: " + names.isEmpty());

        names.clear();

        System.out.println("After clear: " + names);
    }
}
