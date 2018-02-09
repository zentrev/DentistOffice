package BusinessObjects.Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * class of Patient list
 */
public class PatientList extends ArrayList<PatientImp> implements Serializable{

    /**
     * sorts patientList by firstName
     */
    public void sortPatientsFirstName(){
        Collections.sort(this, new Comparator<PatientImp>(){
            @Override
            public int compare(PatientImp o1, PatientImp o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    /**
     * sorts patientList by lastName
     */
    public void sortPatientsLastName(){
        Collections.sort(this, new Comparator<PatientImp>(){
            @Override
            public int compare(PatientImp o1, PatientImp o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    /**
     * sorts patientList by Insurance
     */
    public void sortPatientsInsurence(){
        Collections.sort(this, new Comparator<PatientImp>(){
            @Override
            public int compare(PatientImp o1, PatientImp o2) {
                return o1.getInsurance().compareTo(o2.getInsurance());
            }
        });
    }

}
