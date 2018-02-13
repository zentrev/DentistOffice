package BusinessObjects.Patient;

import BusinessObjects.Appointment.Appointment;
import BusinessObjects.Provider.Provider;

import java.io.Serializable;
import java.util.*;

/**
 * class of Patient list
 */
public class PatientList extends ArrayList<Patient> implements Serializable{

    /**
     * sorts patientList by firstName
     */
    public void sortPatientsFirstName(){
        Collections.sort(this, new Comparator<Patient>(){
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    /**
     * sorts patientList by lastName
     */
    public void sortPatientsLastName(){
        Collections.sort(this, new Comparator<Patient>(){
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    /**
     * sorts patientList by Insurance
     */
    public void sortPatientsInsurence(){
        Collections.sort(this, new Comparator<Patient>(){
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getInsurance().compareTo(o2.getInsurance());
            }
        });
    }

    /**
     * returns a map of patients
     * @return - map of patients
     */
    public Map<Integer, Patient> getPatientMap(){
        sortPatientsFirstName();
        Map<Integer,Patient> map = new HashMap<>();
        for(int i = 0; i<this.size(); i++){
            map.put(i, this.get(i));
        }
        return map;
    }

}
