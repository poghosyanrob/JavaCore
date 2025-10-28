package homework.employee;

public interface Coomandes {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEES = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANE_NAME = "4";



    static void printCoomande (){
        System.out.println("Please input "+EXIT+" for EXIT");
        System.out.println("Please input "+ ADD_EMPLOYEE +" for ADD EMPLOYEE");
        System.out.println("Please input "+ PRINT_ALL_EMPLOYEES +" for PRINT ALL EMPLOYEES");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_EMPLOYEE_ID +" for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input "+SEARCH_EMPLOYEE_BY_COMPANE_NAME+" for SEARCH EMPLOYEE BY COMPANE NAME");
    }
}
