package homework.employee.storage;

import homework.employee.Employee;
import homework.employee.PositionLevel;
import homework.employee.exception.EmployeeNotFoundException;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];

    private int size = 0;
    private String code = "AB000";
    private int idCode = 1;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size] = employee;
        employees[size++].setEmployeeID(code + idCode++);
    }

    private void extend() {
        Employee[] employeeNew = new Employee[10 + size];
        System.arraycopy(employees, 0, employeeNew, 0, size);
        employees = employeeNew;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }


    public Employee searchID(String id) throws EmployeeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (id.contains(employees[i].getEmployeeID())){
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException("EMPLOYEE BY THAT "+ id +" NOT FOUND PLEASE TRY AGAIN");
    }

    public void searchCompane(String  compane) {
        for (int i = 0; i < size; i++) {
            if (compane.contains(employees[i].getCompany())){
                System.out.println(employees[i]);
            }
        }
    }

    public void searchBYLevel(PositionLevel positionLevel) {
        for (int i = 0; i < size; i++) {
            if(positionLevel == employees[i].getLevel()){
                System.out.println(employees[i]);
            }else{
                System.out.println("You have not "+ positionLevel + " level employee");
            }

        }

    }
}
