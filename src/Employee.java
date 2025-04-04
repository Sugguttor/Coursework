import java.util.Objects;

public class Employee {
    private String nick;
    private int department;
    private int salary;
    private static int idCounter = 0;
    private int id;

    public Employee(String nick, int department, int salary) {
        this.nick = nick;
        this.department = department;
        this.salary = salary;
        this.id = ++idCounter;
    }

    public String getNick() {
        return nick;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && idCounter == employee.idCounter && Objects.equals(nick, employee.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, department, salary, idCounter);
    }

    @Override
    public String toString() {
        return nick + ", " + "отдел - " + department + ", " + "зарплата - " + salary + ", id = " + id + "\n";
    }
}
