package homework.medicalCentre.storage;

import homework.medicalCentre.exception.DoctorNotFindByNameException;
import homework.medicalCentre.model.Doctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DoctorStorage implements Serializable {

    private List<Doctor> doctors = new ArrayList<>();
    private int id = 1;


    public void addDoctor(Doctor doctor) {
        doctor.setId(id++);
        doctors.add(doctor);
    }

    public void print() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

    }

    public void doctorFoundingByProfession(String doctorFound) {
        boolean bool = true;
        for (Doctor doctor : doctors) {
            if (doctorFound.contains(doctor.getProfession())) {
                System.out.println(doctor);
                bool = false;
            }
        }

        if (bool) {
            System.err.println("Doctor BY THAT " + doctorFound + " NOT FOUND PLEASE TRY AGAIN");
        }
    }

    public void deleteById(int idForDelete) {
        int index = idForDelete - 1;
        if (index > -1 && index <= doctors.size()) {
            doctors.remove(index);
            id = 1;
            for (Doctor doctor : doctors) {
                doctor.setId(id++);
            }
        } else {
            System.err.println("Doctor BY THAT ID " + idForDelete + " NOT FOUND PLEASE TRY AGAIN");
        }

    }

    public Doctor doctorFoundById(int idForChange) {

        for (Doctor doctor : doctors) {
            if (idForChange == doctor.getId()) {
                return doctor;
            }
        }
        return null;
    }

    public Doctor findByDoctorName(String doctorName) throws DoctorNotFindByNameException {
        for (Doctor doctor : doctors) {
            if (doctorName.contains(doctor.getName())) {
                return doctor;
            }
        }
        throw new DoctorNotFindByNameException("Doctor BY THAT " + doctorName + " NOT FOUND PLEASE TRY AGAIN");
    }

    public void printDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
