package lab3.task4;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {
        return first.getHireDate().compareTo(second.getHireDate());
    }
}
