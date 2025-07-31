package task6;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    String name;
    String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR"),
            new Employee1("Bob", "IT"),
            new Employee1("Charlie", "HR"),
            new Employee1("David", "Finance"),
            new Employee1("Eve", "IT")
        );

        Map<String, List<Employee1>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(emp -> emp.department));

        for (Map.Entry<String, List<Employee1>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employees: " + entry.getValue());
            System.out.println();
        }
    }
}
