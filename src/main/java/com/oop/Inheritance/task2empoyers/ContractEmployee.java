package com.oop.Inheritance.task2empoyers;

import java.util.Objects;

public class ContractEmployee extends Employee implements CalculatePay {
    private String federalTaxIdMember;
    private double fixedMounthlyPay;

    public ContractEmployee() {
    }

    public ContractEmployee(String federalTaxIdMember, double fixedMounthlyPay) {
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMounthlyPay = fixedMounthlyPay;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double fixedMounthlyPay) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMounthlyPay = fixedMounthlyPay;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedMounthlyPay() {
        return fixedMounthlyPay;
    }

    public void setFixedMounthlyPay(double fixedMounthlyPay) {
        this.fixedMounthlyPay = fixedMounthlyPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractEmployee)) return false;
        if (!super.equals(o)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(that.getFixedMounthlyPay(), getFixedMounthlyPay()) == 0 &&
                Objects.equals(getFederalTaxIdMember(), that.getFederalTaxIdMember());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFederalTaxIdMember(), getFixedMounthlyPay());
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", fixedMounthlyPay=" + fixedMounthlyPay +
                '}';
    }

    @Override
    public double calculatePay() {
        double salary = getFixedMounthlyPay();
        return salary;
    }
}
