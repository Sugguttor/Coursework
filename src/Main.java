public class Main {

    public static EmployeeBook employeeBook = new EmployeeBook();


    public static void main(String[] args) {

        employeeBook.addEmployee("Иванилов Артем Сергеевич", 1, 60000);
        employeeBook.addEmployee("Дегтярь Екатерина Николаевна", 2, 650);
        employeeBook.addEmployee("Прудникова Екатерина Николаевна", 3, 66000);
        employeeBook.addEmployee("Силина Зинаида Николаевна", 4, 67000);
        employeeBook.addEmployee("Коновалов Денис Игоревич", 5, 3500);
        employeeBook.addEmployee("Вовк Сергей Михайлович", 1, 120000);
        employeeBook.addEmployee("Ожередов Михаил Геннадьевич", 2, 25500);
        employeeBook.addEmployee("Гудина Игорь Григорьевич", 3, 62000);
        employeeBook.addEmployee("Тур Сергей Андреевич", 4, 61003);
        employeeBook.addEmployee("Ханталин Виталий Николаевич", 5, 55000);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Затраты на ЗП в месяц составляют: " + employeeBook.calculateSumOfSalary() + " рублей.");
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП - " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП - " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("Средняя зарпалата составляет - " + employeeBook.findMidSalary());
        System.out.println();
        employeeBook.printNicks();
        System.out.println();
        employeeBook.increaseSalary(5);
        System.out.println();
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Сотрудник с минимальной зп в отделе: " + employeeBook.findEmployeeWithMinSalaryInDepartment(5));
        System.out.println("Сотрудник с максимальной зп в отделе: " + employeeBook.findEmployeeWithMaxSalaryInDepartment(5));
        System.out.println("Сумма затрат на зп в отделе: " + employeeBook.sumOfSalaryInDepartment(2));
        System.out.println("Средняя зп в отделе составляет: " + employeeBook.findMidSalaryInDepartment(3));
        employeeBook.increaseSalaryInDepartment(2, 10);
        employeeBook.printEmployee();
        System.out.println();
        employeeBook.printEmployeesOfDepartment(1);
        System.out.println();
        employeeBook.findSalaryLessThanNumber(20000);
        System.out.println();
        employeeBook.findSalaryMoreThanNumber(60000);
        System.out.println();
        System.out.println(employeeBook.addNewEmployee("Доценко Владимир Анатольевич",4,80000));
        System.out.println();
        employeeBook.deleteEmployee(7);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println(employeeBook.findEmployeeById(8));
        employeeBook.addNewEmployee("Доценко Владимир Анатольевич",4,80000);
        employeeBook.printEmployee();
    }
}


