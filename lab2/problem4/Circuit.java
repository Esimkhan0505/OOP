package lab2.problem4;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double voltage);

    public double getPower() {
        double voltage = getPotentialDiff();
        return voltage * voltage / getResistance();
    }

    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}
