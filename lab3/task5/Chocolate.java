package lab3.task5;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate[name=" + name + ", weight=" + weight + "]";
    }
}
