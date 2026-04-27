package lab2.problem4;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double voltage) {
        this.potentialDifference = voltage;
        double current = getCurrent();

        first.applyPotentialDiff(current * first.getResistance());
        second.applyPotentialDiff(current * second.getResistance());
    }
}
