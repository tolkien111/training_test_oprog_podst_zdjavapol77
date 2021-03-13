package dev.karolkoltun.School;

import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private LocalDate dateOfBirthday;

    public Student(String name, String surname, LocalDate dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setBirthdayDate(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
