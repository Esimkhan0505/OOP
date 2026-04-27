package lab3.task4;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {
        return first.getName().compareTo(second.getName());
    }
}
