package homework.medicalCentre.coomands;

public interface Commands {
    String EXIT = "0";
    String LOG_IN = "1";
    String REGISRTR = "2";

    String LOG_OUT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String ADD_PATIENT = "3";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "4";
    String PRINT_ALL_PATIENTS = "5";

    String PRINT_ALL_DOCTOR = "6";
    String DELETE_DOCTOR_BY_ID = "7";
    String CHANGE_DOCTOR_BY_ID = "8";
    String REMOVE_USER_BY_EMAIL = "9";
    String PRINT_ALL_USERS = "10";

    static void printUserCoomands() {
        System.out.println("Please input " + LOG_OUT + " for LOG OUT");
        System.out.println("Please input " + ADD_DOCTOR + " for ADD DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + ADD_PATIENT + " for  ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for  PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input " + PRINT_ALL_PATIENTS + " for  PRINT ALL PATIENTS");
    }
    static void printAdminCoomands() {
        System.out.println("Please input " + LOG_OUT + " for LOG OUT");
        System.out.println("Please input " + ADD_DOCTOR + " for ADD DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + ADD_PATIENT + " for  ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for  PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input " + PRINT_ALL_PATIENTS + " for  PRINT ALL PATIENTS");
        System.out.println("Please input " + PRINT_ALL_DOCTOR + " for  PRINT ALL DOCTOR");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE DOCTOR BY ID");
        System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE DOCTOR BY ID");
        System.out.println("Please input " + REMOVE_USER_BY_EMAIL + " for  REMOVE USER BY EMAIL");
        System.out.println("Please input " + PRINT_ALL_USERS + " for  PRINT ALL USERS");
    }
    static void printCoomands(){
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOG_IN + " for LOG IN");
        System.out.println("Please input " + REGISRTR + " for REGISRTR");
    }
}
