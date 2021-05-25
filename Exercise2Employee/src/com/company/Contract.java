package com.company;

public class Contract {
    private String position;
    private int startYear;
    private int endYear;

    public Contract(String position, int startYear, int endYear){
        this.position = position;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "position='" + position + '\'' +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                '}';
    }
}
