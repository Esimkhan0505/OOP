package lab1.p3;

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();           // 0C
        Temperature t2 = new Temperature(100);        // 100C
        Temperature t3 = new Temperature('F');        // 0F
        Temperature t4 = new Temperature(212, 'F');   // 212F

        System.out.println(t1 + " -> F=" + t1.getFahrenheit());
        System.out.println(t2 + " -> F=" + t2.getFahrenheit());
        System.out.println(t3 + " -> C=" + t3.getCelsius());
        System.out.println(t4 + " -> C=" + t4.getCelsius());

        t4.setBoth(0, 'C');
        System.out.println("After setBoth: " + t4 + " -> F=" + t4.getFahrenheit());
    }
}
