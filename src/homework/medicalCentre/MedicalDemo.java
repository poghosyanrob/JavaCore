package homework.medicalCentre;

import homework.medicalCentre.coomands.Commands;
import homework.medicalCentre.coomands.Role;
import homework.medicalCentre.exception.DoctorNotFindByNameException;
import homework.medicalCentre.model.Doctor;
import homework.medicalCentre.model.Patient;
import homework.medicalCentre.model.User;
import homework.medicalCentre.storage.DoctorStorage;
import homework.medicalCentre.storage.PatientStorage;
import homework.medicalCentre.storage.UserStorage;
import homework.medicalCentre.util.FileUtil;

import java.util.Scanner;


public class MedicalDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = FileUtil.deserilizeDocotrStorage();
    private static PatientStorage patientStorage = FileUtil.deserilizePatientStorage();
    private static UserStorage userStorage = FileUtil.deserilizeUserStorage();
    private static User currentUser = null;


    public static void main(String[] args) {
        addAdmin();
        boolean isRun = true;
        while (isRun) {
            Commands.printCoomands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOG_IN:
                    login();
                    break;
                case REGISRTR:
                    register();
                    break;
                default:
                    System.err.println("Wrong command! Try again");
            }
        }

    }

    private static void addAdmin() {
        User admin = new User("admin","admin", "admin@mail.com","admin",Role.ADMIN);
        if(userStorage.getUserByEmail(admin.getEmail()) == null){
            userStorage.register(admin);
        }
    }

    private static void register() {
        System.out.println("PLease input name, surname, email, password");
        String userData = scanner.nextLine();
        String[] userDataArr = userData.split(",");
        String name = userDataArr[0];
        String surname = userDataArr[1];
        String email = userDataArr[2];
        String password = userDataArr[3];
        if (userStorage.getUserByEmail(email) == null) {
            userStorage.register(new User(name, surname, email, password, Role.USER));
            FileUtil.serializeUserData(userStorage);
            System.out.println("User  registered successfully!");
        }else {
            System.err.println("Please choose another email!");
        }
    }

    private static void login() {
        System.out.println("PLease input email, password");
        String loginPasswordStr = scanner.nextLine();
        String[] loginPasswordArr = loginPasswordStr.split(",");
        String login = loginPasswordArr[0];
        String password = loginPasswordArr[1];
        User userByEmail = userStorage.getUserByEmail(login);
        if (userByEmail != null && userByEmail.getPassword().equals(password)) {
            System.out.println("Welcome " + userByEmail.getName());
            currentUser = userByEmail;
            if(userByEmail.getRole() == Role.ADMIN){
                adminLogin();
            }else {
                userLogin();
            }
        } else {
            System.err.println("Invalid username or password");
        }

    }

    private static void adminLogin() {
        boolean isRun = true;
        while (isRun) {
            Commands.printAdminCoomands();
            String command = scanner.nextLine();
            switch (command) {
                case LOG_OUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("Please input Doctor's profession for search");
                    String doctorFoundByProfession = scanner.nextLine();
                    doctorStorage.doctorFoundingByProfession(doctorFoundByProfession);
                    break;
                case ADD_PATIENT:
                    addPatient();
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("Please input Doctor name");
                    String docName = scanner.nextLine();
                    patientStorage.findPatientByDoctorName(docName);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printPatients();
                    break;
                case PRINT_ALL_DOCTOR:
                    doctorStorage.printDoctors();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    doctorStorage.printDoctors();
                    System.out.println("Please input Doctor's id for delete");
                    int idForDelete = Integer.parseInt(scanner.nextLine());
                    doctorStorage.deleteById(idForDelete);
                    FileUtil.serializeDoctorData(doctorStorage);
                    System.out.println("Doctor deleted successfully!");
                    doctorStorage.printDoctors();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    doctorStorage.printDoctors();
                    System.out.println("Please input Doctor's id for change");
                    int idForChange = Integer.parseInt(scanner.nextLine());
                    changeDoctor(idForChange);
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case REMOVE_USER_BY_EMAIL:
                    removeUserByEmail();
                    break;
                case PRINT_ALL_USERS:
                    userStorage.printAllUsers();
                    break;
                default:
                    System.err.println("Wrong command! Try again");
            }
        }

    }

    private static void removeUserByEmail() {
        userStorage.printAllUsers();
        System.out.println("PLease input User's email");
        String userEmail = scanner.nextLine();
        if(userStorage.getUserByEmail(userEmail) != null){
            userStorage.removeUserByEmail(userEmail);
            FileUtil.serializeUserData(userStorage);
            System.out.println("User removed!");
        }else{
            System.err.println(" User with " + userEmail + " does not exists! ");
        }
    }

    private static void userLogin() {

        boolean isRun = true;
        while (isRun) {
            Commands.printUserCoomands();
            String command = scanner.nextLine();
            switch (command) {
                case LOG_OUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("Please input Doctor's profession for search");
                    String doctorFoundByProfession = scanner.nextLine();
                    doctorStorage.doctorFoundingByProfession(doctorFoundByProfession);
                    break;
                case ADD_PATIENT:
                    addPatient();
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("Please input Doctor name");
                    String docName = scanner.nextLine();
                    patientStorage.findPatientByDoctorName(docName);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printPatients();
                    break;
                default:
                    System.err.println("Wrong command! Try again");
            }
        }
    }

    private static void changeDoctor(int idForChange) {
        Doctor changeDoc = doctorStorage.doctorFoundById(idForChange);
        if (null != changeDoc) {
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
        } else {
            System.err.println("Wrong Id " + idForChange + " please try again");
        }
    }

    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please input select Doctor's name");
        String doctorName = scanner.nextLine();
        try {
            Doctor doc = doctorStorage.findByDoctorName(doctorName);
            System.out.println("Please input Patient's name");
            String name = scanner.nextLine();
            System.out.println("Please input Patient's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input Patient's id Card");
            String idCard = scanner.nextLine();
            System.out.println("Please input Patient's phone number");
            int phone = Integer.parseInt(scanner.nextLine());
            Patient patient = new Patient(name, surname, phone, idCard, doc, currentUser.getName());
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
