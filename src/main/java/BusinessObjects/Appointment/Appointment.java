package BusinessObjects.Appointment;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;
import BusinessObjects.Procedure.ProcedureList;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * the Interface od Appointment
 */
public interface Appointment {

    /**
     *
     * @return - the Patient
     */
    public Patient getPatient();

    /**
     *
     * @return - the list of Procedures
     */
    public ProcedureList getProcedures();

    /**
     *
     * @param procedures - sets the list of Procedures
     */
    public void setProceduers(ProcedureList procedures);

    /**
     *
     * @param patient - set the patient
     */
    public void setPatient(Patient patient);

    /**
     *
     * @return - gets the set date
     */
    public Calendar getDate();

    /**
     *
     * @param date - set the date
     */
    public void setDate(Calendar date);

}
