package com.health;

public class Dentist extends HealthProfessional {
    private String qualifications;

    //default constructor
    public Dentist() {
        super();
        this.qualifications = "";
    }

    //second constructor to initialise instance variables
    public Dentist(int id, String name, String doctortype, String qualifications) {
        super(id, name, doctortype);
        this.qualifications = qualifications;
    }

    //getters and setters
    public String getQualifications() {
        return qualifications;
    }

    //Method to print details
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Qualifications: " + qualifications);
    }
}