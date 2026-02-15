package lab1.p2;

public class PolicyDemo {
    public static void main(String[] args) {
        UniversityPolicy p1 = new UniversityPolicy("KBTU");
        UniversityPolicy p2 = new UniversityPolicy("KBTU", Department.ECON);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Cost 15 credits = " + p1.semesterCost(15));
        System.out.println("Cost 15 credits (custom) = " + p1.semesterCost(15, 100000));
    }
}
