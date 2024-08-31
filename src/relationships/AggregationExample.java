package relationships;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName, List<Employee> employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    void displayDepartmentInfo() {
        System.out.println("Department: " + deptName);
        System.out.println("Employees:");
        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        Department dept = new Department("HR", employeeList);
        dept.displayDepartmentInfo();
    }
}
