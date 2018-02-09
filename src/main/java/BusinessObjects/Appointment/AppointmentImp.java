package BusinessObjects.Appointment;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;
import BusinessObjects.Procedure.ProcedureList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Class that makes Appointments
 */
public class AppointmentImp implements Appointment, Serializable {

    private Patient patient;

    private Calendar date;

    private ProcedureList procedures;


    /**
     * Default constructor
     */
    public AppointmentImp(){}

    /**
     * Overloaded constructor takes in a patient, Procedure, Date, charges
     * @param patient - sets the patient
     * @param procedures - sets the procedures
     * @param date - sets date
     */
    public AppointmentImp(Patient patient, ProcedureList procedures, Calendar date){
        this.setPatient(patient);
        this.setProceduers(procedures);
        this.setDate(date);
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
    public ProcedureList getProcedures() {
        return procedures;
    }


    /**
     * Sets the list procedures
     * @param procedures - sets procedures
     */
    public void setProceduers(ProcedureList procedures) {
        if(procedures == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.procedures = procedures;
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
}

