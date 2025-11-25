package homework.medicalCentre.coomands;

public interface Commands {
    String EXIT = "0";
    String LOG_OUT = "1";
    String ADD_DOCTOR = "2";
    String SEARCH_DOCTOR_BY_PROFESSION = "3";
    String DELETE_DOCTOR_BY_ID = "4";
    String CHANGE_DOCTOR_BY_ID = "5";
    String ADD_PATIENT = "6";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "7";
    String PRINT_ALL_PATIENTS = "8";

    static void printCoomands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOG_OUT + " for LOG OUT");
        System.out.println("Please input " + ADD_DOCTOR + " for ADD DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE DOCTOR BY ID");
        System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE DOCTOR BY ID");
        System.out.println("Please input " + ADD_PATIENT + " for  ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for  PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input " + PRINT_ALL_PATIENTS + " for  PRINT ALL PATIENTS");
    }
}
