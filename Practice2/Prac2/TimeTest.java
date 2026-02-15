package Prac2;



public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); // 23:05:06
        System.out.println(t.toStandard());  // 11:05:06 PM

        Time t2 = new Time(4, 24, 33);
        t.add(t2);

        System.out.println("After add:");
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
