package com.oop.Inheritance.task2empoyers;

import java.util.Objects;

public class SalariedEmployee extends Employee implements CalculatePay {
    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHours;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String socialSecurityNumber, double hourlyRate, double numberOfHours) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double numberOfHours) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalariedEmployee)) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.getHourlyRate(), getHourlyRate()) == 0 &&
                Double.compare(that.getNumberOfHours(), getNumberOfHours()) == 0 &&
                Objects.equals(getSocialSecurityNumber(), that.getSocialSecurityNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSocialSecurityNumber(), getHourlyRate(), getNumberOfHours());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHours=" + numberOfHours +
                '}';
    }

    @Override
    public double calculatePay() {
        double salary = getHourlyRate() * getNumberOfHours();
        return salary;
    }
}
