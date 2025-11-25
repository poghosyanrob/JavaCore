package homework.medicalCentre;

import homework.medicalCentre.coomands.Commands;
import homework.medicalCentre.coomands.UserCommands;
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
    private static String nameU;


    public static void main(String[] args) {
        boolean isRun = true;
        Boolean choose = printUserEnter();

        if (choose != null) {
            while (isRun) {
                Commands.printCoomands();
                String command = scanner.nextLine();
                switch (command) {
                    case EXIT:
                        isRun = false;
                        break;
                    case LOG_OUT:
                        choose = printUserEnter();
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
                    case DELETE_DOCTOR_BY_ID:
                        System.out.println("Please input Doctor's id for delete");
                        int idForDelete = Integer.parseInt(scanner.nextLine());
                        doctorStorage.deleteById(idForDelete);
                        FileUtil.serializeDoctorData(doctorStorage);
                        break;
                    case CHANGE_DOCTOR_BY_ID:
                        System.out.println("Please input Doctor's id for change");
                        int idForChange = Integer.parseInt(scanner.nextLine());
                        changeDoctor(idForChange);
                        FileUtil.serializeDoctorData(doctorStorage);
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
                        patientStorage.print();
                        break;
                    default:
                        System.err.println("Wrong command! Try again");
                }
            }
        } else {
            System.err.println("Wrong email or password! Try again");
            printUserEnter();
        }
    }

    private static Boolean chooseUser(String select) {
        UserCommands userCreate = UserCommands.valueOf(select);
        if (userCreate == UserCommands.CREATE) {
            System.out.println("Please input your Name");
            String name = scanner.nextLine();
            nameU = name;
            System.out.println("Please input your Surname");
            String surname = scanner.nextLine();
            System.out.println("Please input your email");
            String email = scanner.nextLine();
            System.out.println("Please input your password");
            String password = scanner.nextLine();
            User user = new User(name, surname, email, password);
            userStorage.createUser(user);
            FileUtil.serializeUserData(userStorage);
            System.out.println("User created successfully ");
            return true;
        } else if (userCreate == UserCommands.LOGIN) {
            System.out.println("Please input your email");
            String email = scanner.nextLine();
            System.out.println("Please input your password");
            String password = scanner.nextLine();
            nameU = userStorage.foundeName(email);
            return userStorage.checkUser(email, password);
        }
        return null;
    }

    private static Boolean printUserEnter() {
        System.out.println("Please choose");
        UserCommands[] userCommands = UserCommands.values();
        for (UserCommands userCommand : userCommands) {
            System.out.print(userCommand + " ");
        }
        String select = scanner.nextLine();
        return chooseUser(select);
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
            Patient patient = new Patient(name, surname, phone, idCard, doc, nameU);
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
