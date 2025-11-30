package homework.medicalCentre.storage;

import homework.medicalCentre.model.Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PatientStorage implements Serializable {

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void printPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void findPatientByDoctorName(String docName) {
        boolean bool = true;
        for (Patient patient : patients) {
            if (docName.contains(patient.getDoctor().getName())) {
                System.out.println(patient);
                bool = false;
            }
        }
        if (bool) {
            System.err.println("Doctor BY THAT " + docName + " NOT FOUND PLEASE TRY AGAIN");
        }
    }
}
