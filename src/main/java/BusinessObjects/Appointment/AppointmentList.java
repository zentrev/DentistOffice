package BusinessObjects.Appointment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class of ArrayList
 */
public class AppointmentList extends ArrayList<Appointment> implements Serializable{

    /**
     * sorts appointmentList by time
     */
    public void sortAppointmentTime(){
        Collections.sort(this, new Comparator<Appointment>() {
            @Override
            public int compare(Appointment o1, Appointment o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

}
