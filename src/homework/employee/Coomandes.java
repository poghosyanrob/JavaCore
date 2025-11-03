package homework.employee;

public interface Coomandes {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEES = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    String SEARCH_EMPLOYEES_BY_POSITION_LEVEL = "5";



    static void printCoomande (){
        System.out.println("Please input "+EXIT+" for EXIT");
        System.out.println("Please input "+ ADD_EMPLOYEE +" for ADD EMPLOYEE");
        System.out.println("Please input "+ PRINT_ALL_EMPLOYEES +" for PRINT ALL EMPLOYEES");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_EMPLOYEE_ID +" for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_COMPANY_NAME +" for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Please input "+ SEARCH_EMPLOYEES_BY_POSITION_LEVEL +" for SEARCH EMPLOYEE BY POSITION LEVEL");
    }
}
