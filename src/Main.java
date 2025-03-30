import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванилов Артем Серегеевич", 1, 60000);
        employees[1] = new Employee("Дегтярь Екатерина Николаевна", 2, 650);
        employees[2] = new Employee("Прудникова Екатерина Николаевна", 3, 66000);
        employees[3] = new Employee("Силина Зинаида Николаевна", 4, 67000);
        employees[4] = new Employee("Коновалов Денис Игоревич", 5, 3500);
        employees[5] = new Employee("Вовк Сергей Михайлович", 1, 120000);
        employees[6] = new Employee("Ожередов Михаил Геннадьевич", 2, 25500);
        employees[7] = new Employee("Гудина Игорь Григорьевич", 3, 62000);
        employees[8] = new Employee("Тур Сергей Андреевич", 4, 61003);
        employees[9] = new Employee("Ханталин Виталий Николаевич", 5, 55000);

        printEmployee(employees);
        System.out.println();
        System.out.println("Затраты на ЗП в месяц составляют: " + sumOfSalary(employees) + " рублей.");
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП - " + findEmployeeWithMinSalary(employees));
        System.out.println();
        System.out.println("Сотрудник с максимальной ЗП - " + findEmployeeWithMaxSalary(employees));
        System.out.println();
        System.out.println("Средняя зарпалата составляет - " + findMidSalary(employees));
        System.out.println();
        printNicks(employees);

    }

    public static void printEmployee(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.print(employees[i].toString());
        }
    }

    public static int sumOfSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i <= employees.length - 1; i++) {
            if (employeeWithMinSalary.getSalary() > employees[i].getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i <= employees.length - 1; i++) {
            if (employeeWithMaxSalary.getSalary() < employees[i].getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static double findMidSalary(Employee[] employees) {
        return (double) sumOfSalary(employees) / employees.length;
    }

    public static void printNicks(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(employees[i].getNick());
        }
    }
}