package BusinessObjects.Appointment;

import BusinessObjects.Procedure.Procedure;

import java.io.Serializable;
import java.util.*;

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

    public Map<Integer, Appointment> getAppointmentMap(){
        sortAppointmentTime();
        Map<Integer,Appointment> map = new HashMap<>();
        for(int i = 0; i<this.size(); i++){
            map.put(i, this.get(i));
        }
        return map;
    }

}
