import java.util.List;

public class Admin {
    private String name;
    private String surname;
    private List<Integer> salaries;

    public Admin (String name, String surname, List<Integer> salaries) {
        this.name = name;
        this.surname = surname;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Integer> getSalaries() {
        return salaries;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
