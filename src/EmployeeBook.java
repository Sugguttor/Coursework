
public class EmployeeBook {

    private final Employee[] employees = new Employee[10];


    public void addEmployee(String nick, int department, int salary) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(nick, department, salary);
                break;
            }
        }
    }

    public void printEmployee() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.print(employees[i].toString());
        }
    }

    public int calculateSumOfSalary() {
        int sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary != null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary != null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
public int sumOfEmployees() {
    int sumOfEmployees = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
        if (employees[i] != null) {
            sumOfEmployees++;
        }
    }
        return sumOfEmployees;
}

    public double findMidSalary() {
        int sumOfEmployees = sumOfEmployees();
        return (double) calculateSumOfSalary() / sumOfEmployees;
    }

    public void printNicks() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].getNick());
        }
    }

    public void increaseSalary(int index) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index / 100));
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId && (employeeWithMinSalaryInDepartment == null || employeeWithMinSalaryInDepartment.getSalary() > employees[i].getSalary())) {
                employeeWithMinSalaryInDepartment = employees[i];
            }
        }
        return employeeWithMinSalaryInDepartment;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId && (employeeWithMaxSalaryInDepartment == null || employeeWithMaxSalaryInDepartment.getSalary() < employees[i].getSalary())) {
                employeeWithMaxSalaryInDepartment = employees[i];
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }

    public int sumOfSalaryInDepartment(int departmentId) {
        int sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public int sumOfEmployeesInDepartment(int departmentId) {
        int sumOfEmployeesInDepartment = 0;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId) {
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
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index / 100));
            }
        }
    }

    public void printEmployeesOfDepartment(int departmentId) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentId) {
                System.out.println(employees[i].getNick() + " " + employees[i].getSalary() + " " + employees[i].getId());
            }
        }
    }

    public void findSalaryLessThanNumber(int number) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getSalary() < number) {
                System.out.println(employees[i].getId() + " " + employees[i].getNick() + " " + employees[i].getSalary());
            }
        }
    }

    public void findSalaryMoreThanNumber(int number) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getSalary() >= number) {
                System.out.println(employees[i].getId() + " " + employees[i].getNick() + " " + employees[i].getSalary());
            }
        }
    }

    public boolean addNewEmployee(String nick, int department, int salary) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(nick, department, salary);
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getId() == employeeId) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee findEmployeeById(int employeeId) {
        Employee employeeWithId = null;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getId() == employeeId) {
                employeeWithId = employees[i];
            }
        }
        return employeeWithId;
    }
}
