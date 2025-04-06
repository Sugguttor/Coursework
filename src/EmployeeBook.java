
public class EmployeeBook {

    private static final Employee[] EMPLOYEES = new Employee[10];

//    private Employee employee;
//    public EmployeeBook (Employee employee){
//        this.employee = employee;
//    }

    public void addEmployee() {
        EMPLOYEES[0] = new Employee("Иванилов Артем Серегеевич", 1, 60000);
        EMPLOYEES[1] = new Employee("Дегтярь Екатерина Николаевна", 2, 650);
        EMPLOYEES[2] = new Employee("Прудникова Екатерина Николаевна", 3, 66000);
        EMPLOYEES[3] = new Employee("Силина Зинаида Николаевна", 4, 67000);
        EMPLOYEES[4] = new Employee("Коновалов Денис Игоревич", 5, 3500);
        EMPLOYEES[5] = new Employee("Вовк Сергей Михайлович", 1, 120000);
        EMPLOYEES[6] = new Employee("Ожередов Михаил Геннадьевич", 2, 25500);
        EMPLOYEES[7] = new Employee("Гудина Игорь Григорьевич", 3, 62000);
        EMPLOYEES[8] = new Employee("Тур Сергей Андреевич", 4, 61003);
        EMPLOYEES[9] = new Employee("Ханталин Виталий Николаевич", 5, 55000);
    }

    public void printEmployee() {
        for (int i = 0; i <= EmployeeBook.EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                i++;
            }
            System.out.print(EmployeeBook.EMPLOYEES[i].toString());
        }
    }

    public int sumOfSalary() {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            sum += EMPLOYEES[i].getSalary();
        }
        return sum;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = EMPLOYEES[0];
        for (int i = 1; i <= EMPLOYEES.length - 1; i++) {
            if (employeeWithMinSalary.getSalary() > EMPLOYEES[i].getSalary()) {
                employeeWithMinSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = EMPLOYEES[0];
        for (int i = 1; i <= EMPLOYEES.length - 1; i++) {
            if (employeeWithMaxSalary.getSalary() < EMPLOYEES[i].getSalary()) {
                employeeWithMaxSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public double findMidSalary() {
        return (double) sumOfSalary() / EMPLOYEES.length;
    }

    public void printNicks() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            System.out.println(EMPLOYEES[i].getNick());
        }
    }

    public void increaseSalary(int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMinSalaryInDepartment == null || employeeWithMinSalaryInDepartment.getSalary() > EMPLOYEES[i].getSalary())) {
                employeeWithMinSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalaryInDepartment;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMaxSalaryInDepartment == null || employeeWithMaxSalaryInDepartment.getSalary() < EMPLOYEES[i].getSalary())) {
                employeeWithMaxSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }

    public int sumOfSalaryInDepartment(int departmentId) {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                sum += EMPLOYEES[i].getSalary();
            }
        }
        return sum;
    }

    public int sumOfEmployeesInDepartment(int departmentId) {
        int sumOfEmployeesInDepartment = 0;
        for (int i = 0; i < EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                sumOfEmployeesInDepartment++;
            }
        }
        return sumOfEmployeesInDepartment;
    }

    public int findMidSalaryInDepartment(int departmentId) {
        int midSalaryInDepartment = 0;
        int sumOfEmployeesInDepartment = sumOfEmployeesInDepartment(departmentId);
        if (sumOfEmployeesInDepartment != 0)
            midSalaryInDepartment = sumOfSalaryInDepartment(departmentId) / sumOfEmployeesInDepartment;
        return midSalaryInDepartment;
    }

    public void increaseSalaryInDepartment(int departmentId, int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
            }
        }
    }

    public void printEmployeesOfDepartment(int departmentId) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                System.out.println(EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary() + " " + EMPLOYEES[i].getId());
            }
        }
    }

    public void findSalaryLessThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getSalary() < number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public void findSalaryMoreThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getSalary() >= number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public boolean addNewEmployee() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = new Employee("Антонов Михаил Игоревич", 4, 60000);
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getId() == employeeId) {
                EMPLOYEES[i] = null;
            }
        }
    }

    public Employee findEmployeeById(int employeeId) {
        Employee employeeWithId = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getId() == employeeId) {
                employeeWithId = EMPLOYEES[i];
            }
        }
        return employeeWithId;
    }
}
