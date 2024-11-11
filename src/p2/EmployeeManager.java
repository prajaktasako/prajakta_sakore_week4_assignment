package p2;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {
	private HashMap<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(int id, String name, String department) {
        employeeMap.put(id, new Employee(id, name, department));
        System.out.println("Employee added: " + name);
    }

    public void getEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found for ID: " + id);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        manager.addEmployee(1, "Divya", "HR");
        manager.addEmployee(2, "Rutuja", "Developer");

        System.out.println("Retrieve employee with ID 1:");
        manager.getEmployee(1);
    }

}
