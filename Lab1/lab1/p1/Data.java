package lab1.p1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0.0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void add(double value) {
        sum += value;
        if (value > max) max = value;
        count++;
    }

    public double getAverage() {
        return (count == 0) ? 0.0 : (sum / count);
    }

    public double getMax() {
        return (count == 0) ? 0.0 : max;
    }
}
