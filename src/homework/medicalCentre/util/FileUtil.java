package homework.medicalCentre.util;

import homework.medicalCentre.storage.DoctorStorage;
import homework.medicalCentre.storage.PatientStorage;
import homework.medicalCentre.storage.UserStorage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class FileUtil {

    private static final String USER_DATA_FILE = "C:\\Users\\myuser\\Desktop\\JavaCore\\src\\homework\\medicalCentre\\data\\userData.data";
    private static final String DOCTOR_DATA_FILE = "C:\\Users\\myuser\\Desktop\\JavaCore\\src\\homework\\medicalCentre\\data\\doctorData.data";
    private static final String PATIENT_DATA_FILE = "C:\\Users\\myuser\\Desktop\\JavaCore\\src\\homework\\medicalCentre\\data\\patientData.data";

    public static void serializeDoctorData(DoctorStorage doctorStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
            outputStream.writeObject(doctorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for Doctor" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize doctor data" + e);
        }
    }

    public static void serializeUserData(UserStorage userStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {
            outputStream.writeObject(userStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for User" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize user data" + e);
        }
    }

    public static void serializePatientData(PatientStorage patientStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            outputStream.writeObject(patientStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for Patient" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize patient data" + e);
        }
    }

    public static DoctorStorage deserilizeDocotrStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof DoctorStorage doctorStorage) {
                return doctorStorage;
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found for Doctor data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Deserialize doctor data" + e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new DoctorStorage();
    }

    public static PatientStorage deserilizePatientStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof PatientStorage patientStorage) {
                return patientStorage;
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found for Patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Deserialize patient data" + e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStorage();
    }

    public static UserStorage deserilizeUserStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(USER_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof UserStorage userStorage) {
                return userStorage;
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found for User data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Deserialize User data" + e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new UserStorage();
    }


}
