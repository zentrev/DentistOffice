package BusinessObjects.Appointment;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;

import java.util.ArrayList;
import java.util.Calendar;

public interface Appointment {

    public Patient getPatient();

    public ArrayList<Procedure> getProceduers();

    public void setProceduers(ArrayList<Procedure> proceduers);

    public void setPatient(Patient patient);

    public Calendar getDate();

    public void setDate(Calendar date);

    public double getCharge();

    public void setCharge(double charge);
}
