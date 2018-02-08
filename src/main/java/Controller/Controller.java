package Controller;

import BusinessObjects.Appointment.Appointment;
import BusinessObjects.Appointment.AppointmentImp;
import BusinessObjects.Appointment.AppointmentList;
import BusinessObjects.Patient.Patient;
import BusinessObjects.Procedure.Procedure;

import java.util.ArrayList;
import java.util.Calendar;

public class Controller {

    AppointmentList appointmentList;
//    PatientList patientList;
//    ProcedureList procedureList;
//    ProviderList providerList;
//    UserList userList;

    public Controller(){
        appointmentList = new AppointmentList();

    }

    public void addAppointment(Appointment appointment){
        appointmentList.add(appointment);
    }

    public void removeAppointment(Appointment appointment){
        appointmentList.remove(appointment);
    }

    public void addPatient(Patient patient){
        patientList.add(patient);
    }

    public void removePatient(Patient patient){
        patientList.remove(patient);
    }
}
