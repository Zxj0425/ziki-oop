package com.health;

public class HealthProfessional {
    private int id;
    private String name;
    private String doctortype;

    //default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.doctortype = "";
    }

    //second constructor to initialise instance variables
    public HealthProfessional(int id, String name, String doctortype) {
        this.id = id;
        this.name = name;
        this.doctortype = doctortype;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctortype() {
        return doctortype;
    }

    public void setDoctortype(String doctortype) {
        this.doctortype = doctortype;
    }

    //Method to print details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Doctor Type: " + doctortype);
    }

    @Override
    public String toString() {
        return String.format(
                "HealthProfessional [ID: %d, name: %s, Doctor Type: %s]", id, name, doctortype);

    }
}