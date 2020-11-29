package ru.julia.mortgage.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class MortgageDto {
    String name;
    String surname;
    Long monthlyPayment;
    String passport;

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

    public MortgageDto(String name, String surname, Long monthlyPayment, String passport) {
        this.name = name;
        this.surname = surname;
        this.monthlyPayment = monthlyPayment;
        this.passport = passport;
    }
}
