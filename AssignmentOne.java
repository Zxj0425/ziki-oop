package com.health;

import java.util.ArrayList;

public class AssignmentOne{
    private static final ArrayList<Appointment> appointmentsList = new ArrayList<>();

    //part 3-Using classes and objects
    public static void main(String[] args) {

        //Code demonstrating part 3
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Olivia", "General Practitioner", "MBBS");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Benjamin", "General Practitioner", "B.Med");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Sophia", "General Practitioner", "B.Surg");

        Dentist dentist1 = new Dentist(4, "Dr. Alexander", "Dentist", "DMD");
        Dentist dentist2 = new Dentist(5, "Dr. Emma", "Dentist", "DDS");

        // Printing out Doctor Information
        System.out.println("The List of Available Doctors are Given Below:");
        System.out.println("General Practitioners:");
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        System.out.println("Dentists:");
        dentist1.printDetails();
        System.out.println("------------------------------");
        dentist2.printDetails();
        System.out.println("------------------------------");

        //Code demonstrating part 3
        createAppointment("Ava", 123456789, "08:00 AM", gp1);
        createAppointment("James", 234567891, "10:00 AM", gp2);

        createAppointment("Isabella", 456789123, "1:00 PM", dentist1);
        createAppointment("Ethan", 567891234, "2:00 PM", dentist2);
        printExistingAppointments(appointmentsList);

        cancelBooking(123456789);

        printExistingAppointments(appointmentsList);
    }

    // Part 5 –  Collection of appointments

    //method created for creating Appointments
    public static void createAppointment(String patientname, int patientphone, String preferredtime, HealthProfessional doctor){
        if (patientname.isEmpty() || patientphone==0 || preferredtime.isEmpty() || doctor==null){
            System.out.println("Appointment cannot be created, All information should be provide");
        } else {
            Appointment appointment1 = new Appointment(patientname, patientphone, preferredtime, doctor);
            appointmentsList.add(appointment1);
            System.out.println("Appointment created successfully");
            System.out.println("------------------------------");
        }
    }

    //method created for printing Existing Appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointmentsList) {
        if (appointmentsList.isEmpty()){
            System.out.println("No current Appointment");
        } else {
            System.out.println("The Existing Appointments are listed below:");
            for (Appointment appointment : appointmentsList) {
                System.out.println("Patient Name: " + appointment.getPatientName());
                System.out.println("Patient Phone: " + appointment.getPatientPhone());
                System.out.println("Preferred Time: " + appointment.getPreferredTime());
                System.out.println("Doctor: " + appointment.getDoctor().getName());
                System.out.println("------------------------------");
            }
        }
    }

    //method created for printing cancelling bookings
    public static void cancelBooking(int patientphone) {
        boolean found = false;
        for (Appointment appointment : appointmentsList) {
            if (appointment.getPatientPhone() == patientphone) {
                appointmentsList.remove(appointment);
                System.out.println("Booking cancelled for patient with phone number:" + patientphone);
                System.out.println("------------------------------");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found with patient phone number: " + patientphone);
            System.out.println("------------------------------");
        }
    }
}