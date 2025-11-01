package homework.employee.model;

import homework.employee.Coomandes;
import homework.employee.Employee;
import homework.employee.EmployeeIdNotFoundException;
import homework.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Coomandes {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun){
            Coomandes.printCoomande();
            String coomand = scanner.nextLine();
            switch (coomand){
                case EXIT :
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("Please input employee's ID for search employee");
                    String id = scanner.nextLine();
                    try {
                        employeeStorage.searchID(id);
                    } catch (EmployeeIdNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANE_NAME:
                    System.out.println("Please input compane's name for search");
                    String compane = scanner.nextLine();
                    employeeStorage.searchCompane(compane);
                    break;
                default:
                    System.err.println("Wrong coomand! Try again");
            }


        }

    }

    private static void addEmployee() {
        System.out.println("Please  input Employee's name");
        String name = scanner.nextLine();
        System.out.println("Please  input Employee's username");
        String username = scanner.nextLine();
        System.out.println("Please  input Employee's salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Please  input Employee's company name");
        String company = scanner.nextLine();
        System.out.println("Please  input Employee's position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name,username,salary,company,position);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully ");
    }
}
