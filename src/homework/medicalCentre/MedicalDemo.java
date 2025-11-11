package homework.medicalCentre;

import homework.medicalCentre.exception.DoctorNotFindByNameException;
import homework.medicalCentre.model.Doctor;
import homework.medicalCentre.model.Patient;
import homework.medicalCentre.storage.DoctorStorage;
import homework.medicalCentre.storage.PatientStorage;

import java.util.Scanner;

public class MedicalDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCoomands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("Please input Doctor's profession for search");
                    String doctorFoundByProfession = scanner.nextLine();
                    doctorStorage.doctorFoundingByProfession(doctorFoundByProfession);
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Please input Doctor's id for delete");
                    int idForDelete = Integer.parseInt(scanner.nextLine());
                    doctorStorage.deleteById(idForDelete);
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.println("Please input Doctor's id for change");
                    int idForChange = Integer.parseInt(scanner.nextLine());
                    changeDoctor(idForChange);
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("Please input Doctor name");
                    String  docName = scanner.nextLine();
                    patientStorage.findPatientByDoctorName(docName);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.print();
                    break;
                default:
                    System.err.println("Wrong command! Try again");
            }
        }
    }

    private static void changeDoctor(int idForChange) {
        Doctor changeDoc = doctorStorage.doctorFoundById(idForChange);
        if(null != changeDoc){
            System.out.println("Please input Doctor's new name for change");
            String changeName = scanner.nextLine();
            changeDoc.setName(changeName);
            System.out.println("Please input Doctor's new surname for change");
            String changeSurname = scanner.nextLine();
            changeDoc.setSurname(changeSurname);
            System.out.println("Please input Doctor's new phone number for change");
            int changePhoneNumber = Integer.parseInt(scanner.nextLine());
            changeDoc.setPhone(changePhoneNumber);
            System.out.println("Please input Doctor's new email for change");
            String changeEmail = scanner.nextLine();
            changeDoc.setEmail(changeEmail);
            System.out.println("Please input Doctor's new profession for change");
            String changeProfession = scanner.nextLine();
            changeDoc.setProfession(changeProfession);
            System.out.println(changeDoc);
            System.out.println("Doctor change added successfully");
        }else{
            System.err.println("Wrong Id " + idForChange + " please try again");
        }
    }

    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please input select Doctor's name");
        String doctorName = scanner.nextLine();
        try {
            Doctor doc =  doctorStorage.findByDoctorName(doctorName);
            System.out.println("Please input Patient's name");
            String name = scanner.nextLine();
            System.out.println("Please input Patient's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input Patient's id Card");
            String idCard = scanner.nextLine();
            System.out.println("Please input Patient's phone number");
            int phone = Integer.parseInt(scanner.nextLine());
            Patient patient = new Patient(name, surname, phone, idCard,doc);
            patientStorage.addPatient(patient);
            System.out.println("Patient added successfully ");
        } catch (DoctorNotFindByNameException e) {
            System.err.println(e.getMessage());
        }

    }

    private static void addDoctor() {
        System.out.println("Please input Doctor's name");
        String name = scanner.nextLine();
        System.out.println("Please input Doctor's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Doctor's phone number");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Doctor's email");
        String email = scanner.nextLine();
        System.out.println("Please input Doctor's profession");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(name, surname, phone, email, profession);
        doctorStorage.addDoctor(doctor);
        System.out.println("Doctor added successfully");
    }

}
