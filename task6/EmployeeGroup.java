package task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGroup {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("David", "Finance"));
        employees.add(new Employee("Eve", "IT"));

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employees: " + entry.getValue());
            System.out.println();
        }
    }
}

