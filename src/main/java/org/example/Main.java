package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "+7-913-123-45-67", "Mary", 1);
        Employee employee2 = new Employee(2, "+7-913-234-56-78", "Aleksey", 2);
        Employee employee3 = new Employee(3, "+7-913-345-67-89", "Nikita", 3);
        Employee employee4 = new Employee(4, "+7-913-456-78-90", "Svetlana", 2);
        Employee employee5 = new Employee(5, "+7-913-567-89-01", "Mary", 4);

        EmployeeList employeeList = new EmployeeList();

        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        employeeList.addEmployee(employee4);
        employeeList.addEmployee(employee5);

        System.out.println("getEmployeeByExperience - usage");
        System.out.println(employeeList.getEmployeeByExperience(2));
        System.out.println();

        System.out.println("getEmployeeByPhoneNumber - usage");
        System.out.println(employeeList.getEmployeeByPhoneNumber("Mary"));
        System.out.println();

        System.out.println("getEmployeeByID - usage");
        System.out.println(employeeList.getEmployeeByID(1));

    }
}