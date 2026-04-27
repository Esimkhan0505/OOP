package lab2.problem5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public boolean canOwnPet(Animal pet) {
        return !(pet instanceof Dog);
    }

    @Override
    public String getOccupation() {
        return "PhDStudent researching " + researchTopic;
    }
}
