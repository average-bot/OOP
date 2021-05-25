package com.company;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }
    //salary for one month
    public double earning(){
        return weeklySalary*4;
    }

    public String toString(){
        return ("a Salaried employee "
                + "\nFirst Name: " + getFirstName()
                + "\nLast name: " + getLastName()
                + "\nSSN: " + getSsn()
                + "\nWeekley salary: " + weeklySalary);
    }

    //salary for one week
    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}
