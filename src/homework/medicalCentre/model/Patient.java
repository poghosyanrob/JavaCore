package homework.medicalCentre.model;

import homework.medicalCentre.Person;
import homework.medicalCentre.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private String idCard;
    private Doctor doctor;
    private Date date = new Date();
    private String userName;

    public Patient(String name, String surname, int phone, String idCard, Doctor doctor, String userName) {
        super(name, surname, phone);
        this.idCard = idCard;
        this.doctor = doctor;
        this.userName = userName;
    }

    public Patient() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return Objects.equals(doctor, patient.doctor) && Objects.equals(date, patient.date) && Objects.equals(userName, patient.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, date, userName);
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
                ", userName='" + userName + '\'' +
                "} ";
    }
}
