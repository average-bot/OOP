package com.company;

import java.util.ArrayList;

public abstract class Employee implements IPayable {

    private String firstName;
    private String lastName;
    private String ssn;
    public ArrayList<Contract> contracts;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        contracts = new ArrayList<Contract>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public abstract double earning();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
