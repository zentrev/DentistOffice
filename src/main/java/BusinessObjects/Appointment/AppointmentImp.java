package BusinessObjects.Appointment;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class AppointmentImp implements Appointment, Serializable {

    private Patient patient;

    private Calendar date;

    private ArrayList<Procedure> proceduers;

    private double charge;

    public AppointmentImp(){}

    public AppointmentImp(Patient patient, ArrayList<Procedure> procedures, Calendar date, double charge){
        this.setPatient(patient);
        this.setProceduers(procedures);
        this.setDate(date);
        this.setCharge(charge);
    }

    public Patient getPatient() {
        return patient;
    }

    public ArrayList<Procedure> getProceduers() {
        return proceduers;
    }

    public void setProceduers(ArrayList<Procedure> proceduers) {
        this.proceduers = proceduers;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;

    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}

