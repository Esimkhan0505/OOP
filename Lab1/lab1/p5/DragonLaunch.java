package lab1.p5;


import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

   
    public boolean willDragonEatOrNot() {
        int top = 0;

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            kidnapped.set(top, cur);
            top++;

            if (top >= 2) {
                Person prev = kidnapped.get(top - 2);
                Person last = kidnapped.get(top - 1);

                if (prev.getGender() == Gender.BOY && last.getGender() == Gender.GIRL) {
                    top -= 2;
                }
            }
        }

        return top == 0;
    }
}
