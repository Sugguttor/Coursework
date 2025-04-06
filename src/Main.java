public class Main {

    public  static EmployeeBook employeeBook = new EmployeeBook();
    public static void main(String[] args) {


        employeeBook.addEmployee();
        employeeBook.printEmployee();
        System.out.println();
        System.out.println("Затраты на ЗП в месяц составляют: " + employeeBook.sumOfSalary() + " рублей.");
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
        System.out.println(employeeBook.addNewEmployee());
        System.out.println();
        employeeBook.deleteEmployee(7);
        employeeBook.printEmployee();
        System.out.println();
        System.out.println(employeeBook.findEmployeeById(8));
    }
}


