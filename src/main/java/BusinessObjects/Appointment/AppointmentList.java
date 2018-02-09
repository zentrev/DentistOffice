package BusinessObjects.Appointment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class of ArrayList
 */
public class AppointmentList extends ArrayList<AppointmentImp> implements Serializable{

    /**
     * sorts appointmentList by time
     */
    public void sortAppointmentTime(){
        Collections.sort(this, new Comparator<AppointmentImp>() {
            @Override
            public int compare(AppointmentImp o1, AppointmentImp o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

}
