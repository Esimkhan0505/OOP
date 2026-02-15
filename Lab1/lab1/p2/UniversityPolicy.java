package lab1.p2;

public class UniversityPolicy {

  
    public static final int MAX_CREDITS_PER_SEMESTER = 30;

 
    public static double creditPriceKZT = 120000.0;

  
    private final String universityName;

   
    private Department department;


    {
        department = Department.FIT;
    }


    static {
        if (creditPriceKZT < 0) creditPriceKZT = 0;
    }


    public UniversityPolicy(String universityName) {
        this.universityName = universityName; // this
    }

    public UniversityPolicy(String universityName, Department department) {
        this.universityName = universityName;
        this.department = department;
    }


    public double semesterCost(int credits) {
        return semesterCost(credits, creditPriceKZT);
    }

    public double semesterCost(int credits, double customPrice) {
        if (credits < 0 || credits > MAX_CREDITS_PER_SEMESTER) return -1;
        if (customPrice < 0) return -1;
        return credits * customPrice;
    }

    public String getUniversityName() { 
        return universityName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UniversityPolicy{name='" + universityName + "', dept=" + department +
                ", creditPriceKZT=" + creditPriceKZT + "}";
    }
}
