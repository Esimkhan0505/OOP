package pr4.interfaces.model1;

public class iPhone implements SellableAndPluggable {

    @Override
    public void sell() {
        System.out.println("iPhone is being sold.");
    }

    @Override
    public void plugIn() {
        System.out.println("iPhone is plugged in.");
    }
}