package com.company;

public class HourlyEmployee extends Employee{

    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String ssn, int hours, double wage) {
        super(firstName, lastName, ssn);
        this.hours = hours;
        this.wage = wage;
    }

    //we assume that this method will return the earning per
    //month if the employee works same amount of hours in 4 weeks
    public double earning(){
        return hours * wage * 4;
    }

    public String toString(){
        return ("An hourly employee "
                + "\nFirst Name: " + getFirstName()
                + "\nLast name: " + getLastName()
                + "\nSSN: " + getSsn()
                + "\nweekley salary depending on hours worked in a week: " + earning());
    }

    @Override
    public double getPaymentAmount() {
        return hours * wage;
    }
}
