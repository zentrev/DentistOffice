package BusinessObjects.Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

}
