package homework.medicalCentre.storage;

import homework.medicalCentre.model.Patient;

import java.io.Serializable;

public class PatientStorage implements Serializable {

    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void addPatient(Patient patient) {

        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;

    }

    private void extend() {
        Patient[] newPatient = new Patient[size + 10];
        System.arraycopy(patients, 0, newPatient, 0, size);
        patients = newPatient;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void findPatientByDoctorName(String docName) {
        boolean bool = true;
        for (int i = 0; i < size; i++) {
            if (docName.contains(patients[i].getDoctor().getName())){
                System.out.println(patients[i]);
                bool = false;
            }
        }
        if (bool){
            System.err.println("Doctor BY THAT "+ docName +" NOT FOUND PLEASE TRY AGAIN");
        }
    }
}
