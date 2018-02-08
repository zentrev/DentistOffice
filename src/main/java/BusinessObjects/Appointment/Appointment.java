package BusinessObjects.Appointment;

import java.util.ArrayList;
import java.util.Calendar;

public interface Appointment {

    public Paiient getPatient();

    public ArrayList<Proceduer> getProceduers();

    public void setProceduers(ArrayList<Proceduer> proceduers);

    public void setPatient(Paiient patient);

    public Calendar getDate();

    public void setDate(Calendar date);

    public double getCharge();

    public void setCharge(double charge);
}
