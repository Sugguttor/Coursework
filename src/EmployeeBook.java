
public class EmployeeBook {

    private final Employee[] EMPLOYEES = new Employee[10];


    public void addEmployee(String nick, int department, int salary) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = new Employee(nick, department, salary);
                break;
            }
        }
    }

    public void printEmployee() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                continue;
            }
            System.out.print(EMPLOYEES[i].toString());
        }
    }

    public int calculateSumOfSalary() {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                continue;
            }
            sum += EMPLOYEES[i].getSalary();
        }
        return sum;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public double findMidSalary() {
        return (double) calculateSumOfSalary() / EMPLOYEES.length;
    }

    public void printNicks() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                continue;
            }
            System.out.println(EMPLOYEES[i].getNick());
        }
    }

    public void increaseSalary(int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null) {
                EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMinSalaryInDepartment == null || employeeWithMinSalaryInDepartment.getSalary() > EMPLOYEES[i].getSalary())) {
                employeeWithMinSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalaryInDepartment;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMaxSalaryInDepartment == null || employeeWithMaxSalaryInDepartment.getSalary() < EMPLOYEES[i].getSalary())) {
                employeeWithMaxSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }

    public int sumOfSalaryInDepartment(int departmentId) {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId) {
                sum += EMPLOYEES[i].getSalary();
            }
        }
        return sum;
    }

    public int sumOfEmployeesInDepartment(int departmentId) {
        int sumOfEmployeesInDepartment = 0;
        for (int i = 0; i < EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId) {
                sumOfEmployeesInDepartment++;
            }
        }
        return sumOfEmployeesInDepartment;
    }

    public int findMidSalaryInDepartment(int departmentId) {
        int midSalaryInDepartment = 0;
        int sumOfEmployeesInDepartment = sumOfEmployeesInDepartment(departmentId);
        if (sumOfEmployeesInDepartment != 0) {
            midSalaryInDepartment = sumOfSalaryInDepartment(departmentId) / sumOfEmployeesInDepartment;
        }
        return midSalaryInDepartment;
    }

    public void increaseSalaryInDepartment(int departmentId, int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId) {
                EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
            }
        }
    }

    public void printEmployeesOfDepartment(int departmentId) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getDepartment() == departmentId) {
                System.out.println(EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary() + " " + EMPLOYEES[i].getId());
            }
        }
    }

    public void findSalaryLessThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getSalary() < number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public void findSalaryMoreThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getSalary() >= number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public boolean addNewEmployee(String nick, int department, int salary) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = new Employee(nick, department, salary);
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i] != null && EMPLOYEES[i].getId() == employeeId) {
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
