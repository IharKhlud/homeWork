import java.util.*;

public class Calc {
    public static double getAverageValueForMonths(List<Integer> list, int months) {
        int avarageSalary = 0;
        int count = 0;
        List<Integer> listSalary = new ArrayList<>();
        listSalary.addAll(list);
        Collections.reverse(listSalary);
        for (int i : listSalary) {
            avarageSalary += i;
            count++;
            if (count == months) {
                break;
            }
        }

        return (avarageSalary * 1.0) / months;
    }
}
