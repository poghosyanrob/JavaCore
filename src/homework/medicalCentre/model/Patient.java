package homework.medicalCentre.model;

import homework.medicalCentre.Person;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private String idCard;
    private Doctor doctor;

    public Patient(String name, String surname, int phone, String idCard,Doctor doctor) {
        super(name, surname, phone);
        this.idCard = idCard;
        this.doctor = doctor;
    }

    public Patient() {

    }

    private Date registerDateTime = new Date();

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", id Card=" + idCard +
                ", phone=" + super.getPhone() +
                ", doctor=" + doctor.getName() +
                ", registerDateTime=" + registerDateTime +
                "} ";
    }
}
