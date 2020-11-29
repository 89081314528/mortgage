package ru.julia.mortgage.enteties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mortgage")
public class Mortgage {
    @Column(name = "first_name")
    String name;
    @Column(name = "last_name")
    String surname;
    @Column(name = "monthly_payment")
    Long monthlyPayment;
    @Column(name = "passport_number")
    @Id
    String passport;

    public Mortgage(String name, String surname, Long monthlyPayment, String passport) {
        this.name = name;
        this.surname = surname;
        this.monthlyPayment = monthlyPayment;
        this.passport = passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMonthlyPayment(Long monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getPassport() {
        return passport;
    }
}
