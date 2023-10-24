package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList(){
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeByExperience(int experience){
        if (!employeeList.isEmpty()) {
            List<Employee> resultList = new ArrayList<>();
            for (Employee employee : employeeList) {
                if (employee.getExpirience() == experience) resultList.add(employee);
            }
            return resultList;
        }
        return null;
    }

    public void printPhoneNumber(String name) {
        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee.getName().equals(name)) {
                    System.out.println("Name : " + employee.getName() + ", phone number : " +
                            employee.getPhoneNumber());
                }
            }
        }
    }

    public Employee getEmployeeByID(int id) {
        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee.getId() == id) return employee;
            }
        }
        return null;
    }

    public void addEmployee (Employee employee) {
        employeeList.add(employee);
    }

}