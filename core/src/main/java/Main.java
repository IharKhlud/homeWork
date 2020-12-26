import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Admin> adminList = new ArrayList<Admin>();
        adminList.add(new Admin("Ihar", "Khlud", Arrays.asList(10, 12, 15, 17, 10, 10, 6)));
        adminList.add(new Admin("Ivan", "Ivanov", Arrays.asList(7, 5, 17)));
        adminList.add(new Admin("Petr", "Petrov", Arrays.asList(9, 10, 11, 17, 19)));
        adminList.add(new Admin("Tom", "Black", Arrays.asList(5)));
        adminList.add(new Admin("John", "Wick", new ArrayList<Integer>()));

        int months = 3;
        for (Admin admin : adminList) {
            getAveragySalary(admin, months);
        }
    }

    public static void getAveragySalary(Admin admin, int months) {
        System.out.println(admin.toString() + " received an average salary for " + months + " months "
                + Calc.getAverageValueForMonths(admin.getSalaries(), months));
    }
}
