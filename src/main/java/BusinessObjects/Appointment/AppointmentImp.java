package BusinessObjects.Appointment;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Class that makes Appointments
 */
public class AppointmentImp implements Appointment, Serializable {

    private Patient patient;

    private Calendar date;

    private ArrayList<Procedure> proceduers;

    private double charge;

    /**
     * Default constructor
     */
    public AppointmentImp(){}

    /**
     * Overloaded constructor takes in a patient, Procedure, Date, charges
     * @param patient - sets the patient
     * @param procedures - sets the procedures
     * @param date - sets date
     * @param charge - sets charge
     */
    public AppointmentImp(Patient patient, ArrayList<Procedure> procedures, Calendar date, double charge){
        this.setPatient(patient);
        this.setProceduers(procedures);
        this.setDate(date);
        this.setCharge(charge);
    }

    /**
     * Gets the set patient
     * @return - patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Gets the list of Procedueres
     * @return - procedurs
     */
    public ArrayList<Procedure> getProceduers() {
        return proceduers;
    }

    /**
     * Sets the list procedures
     * @param proceduers - sets procedures
     */
    public void setProceduers(ArrayList<Procedure> proceduers) {
        if(proceduers == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.proceduers = proceduers;
    }

    /**
     * Sets the Patient
     * @param patient - sets the patient
     */
    public void setPatient(Patient patient) {
        if(patient == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.patient = patient;

    }

    /**
     * Gets the set Date
     * @return - the set date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the date
     * @param date - sets the date
     */
    public void setDate(Calendar date) {
        if(date == null){
            throw new IllegalArgumentException("Cannont be null");
        }
        this.date = date;
    }

    /**
     * Gets the set Charge
     * @return - the set Charge
     */
    public double getCharge() {
        return charge;
    }

    /**
     * Sets the charge
     * @param charge - sets the charge
     */
    public void setCharge(double charge) {
        if(charge > 0){
            throw new IllegalArgumentException("Cannont be less then 0");
        }
        this.charge = charge;
    }
}

