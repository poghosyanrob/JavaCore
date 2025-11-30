package homework.medicalCentre.model;

import homework.medicalCentre.Person;
import homework.medicalCentre.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private String idCard;
    private Doctor doctor;
    private Date date = new Date();
    private String user;

    public Patient(String name, String surname, int phone, String idCard, Doctor doctor, String user) {
        super(name, surname, phone);
        this.idCard = idCard;
        this.doctor = doctor;
        this.user = user;
    }

    public Patient() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(idCard, patient.idCard) && Objects.equals(doctor, patient.doctor) && Objects.equals(date, patient.date) && Objects.equals(user, patient.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idCard, doctor, date, user);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", id Card=" + idCard +
                ", phone=" + super.getPhone() +
                ", doctor=" + doctor.getName() +
                ", date=" + DateUtil.fromDateToStr(date) +
                ", user='" + user + '\'' +
                "} ";
    }
}
