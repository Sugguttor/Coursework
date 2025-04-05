public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {

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

        printEmployee();
        System.out.println();
        System.out.println("Затраты на ЗП в месяц составляют: " + sumOfSalary() + " рублей.");
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП - " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП - " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарпалата составляет - " + findMidSalary());
        System.out.println();
        printNicks();
        System.out.println();
        increaseSalary(5);
        System.out.println();
        printEmployee();
        System.out.println();
        System.out.println("Сотрудник с минимальной зп в отделе: " + findEmployeeWithMinSalaryInDepartment(5));
        System.out.println("Сотрудник с максимальной зп в отделе: " + findEmployeeWithMaxSalaryInDepartment(5));
        System.out.println("Сумма затрат на зп в отделе: " + sumOfSalaryInDepartment(2));
        System.out.println("Средняя зп в отделе составляет: " + findMidSalaryInDepartment(3));
        increaseSalaryInDepartment(2, 10);
        printEmployee();
        System.out.println();
        printEmployeesOfDepartment(1);
        System.out.println();
        findSalaryLessThanNumber(20000);
        System.out.println();
        findSalaryMoreThanNumber(60000);


    }

    public static void printEmployee() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            System.out.print(EMPLOYEES[i].toString());
        }
    }

    public static int sumOfSalary() {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            sum += EMPLOYEES[i].getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = EMPLOYEES[0];
        for (int i = 1; i <= EMPLOYEES.length - 1; i++) {
            if (employeeWithMinSalary.getSalary() > EMPLOYEES[i].getSalary()) {
                employeeWithMinSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = EMPLOYEES[0];
        for (int i = 1; i <= EMPLOYEES.length - 1; i++) {
            if (employeeWithMaxSalary.getSalary() < EMPLOYEES[i].getSalary()) {
                employeeWithMaxSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static double findMidSalary() {
        return (double) sumOfSalary() / EMPLOYEES.length;
    }

    public static void printNicks() {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            System.out.println(EMPLOYEES[i].getNick());
        }
    }

    public static void increaseSalary(int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
        }
    }

    public static Employee findEmployeeWithMinSalaryInDepartment(int departmentId) {
        Employee employeeWithMinSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMinSalaryInDepartment == null || employeeWithMinSalaryInDepartment.getSalary() > EMPLOYEES[i].getSalary())) {
                employeeWithMinSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalaryInDepartment;
    }

    public static Employee findEmployeeWithMaxSalaryInDepartment(int departmentId) {
        Employee employeeWithMaxSalaryInDepartment = null;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId && (employeeWithMaxSalaryInDepartment == null || employeeWithMaxSalaryInDepartment.getSalary() < EMPLOYEES[i].getSalary())) {
                employeeWithMaxSalaryInDepartment = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalaryInDepartment;
    }

    public static int sumOfSalaryInDepartment(int departmentId) {
        int sum = 0;
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                sum += EMPLOYEES[i].getSalary();
            }
        }
        return sum;
    }

    public static int sumOfEmployeesInDepartment(int departmentId) {
        int sumOfEmployeesInDepartment = 0;
        for (int i = 0; i < EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                sumOfEmployeesInDepartment++;
            }
        }
        return sumOfEmployeesInDepartment;
    }

    public static int findMidSalaryInDepartment(int departmentId) {
        int midSalaryInDepartment = 0;
        int sumOfEmployeesInDepartment = sumOfEmployeesInDepartment(departmentId);
        if (sumOfEmployeesInDepartment != 0)
            midSalaryInDepartment = sumOfSalaryInDepartment(departmentId) / sumOfEmployeesInDepartment;
        return midSalaryInDepartment;
    }

    public static void increaseSalaryInDepartment(int departmentId, int index) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + (EMPLOYEES[i].getSalary() * index / 100));
            }
        }
    }

    public static void printEmployeesOfDepartment(int departmentId) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getDepartment() == departmentId) {
                System.out.println(EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary() + " " + EMPLOYEES[i].getId());
            }
        }
    }

    public static void findSalaryLessThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getSalary() < number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public static void findSalaryMoreThanNumber(int number) {
        for (int i = 0; i <= EMPLOYEES.length - 1; i++) {
            if (EMPLOYEES[i].getSalary() >= number) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getNick() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }
}

