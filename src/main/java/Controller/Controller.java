package Controller;

import BusinessObjects.Appointment.Appointment;
import BusinessObjects.Appointment.AppointmentImp;
import BusinessObjects.Appointment.AppointmentList;
import BusinessObjects.Patient.Patient;
import BusinessObjects.Patient.PatientList;
import BusinessObjects.Procedure.Procedure;
import BusinessObjects.Procedure.ProcedureList;
import BusinessObjects.Provider.Provider;
import sun.security.jca.ProviderList;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Controller {

    private AppointmentList appointmentList;
    private PatientList patientList;
    private ProcedureList procedureList;
    private ProviderList  providerList;
    private UserList userList;

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

    public void addProcedure(Procedure procedure){
        procedureList.add(procedure);
    }

    public void removeProcedure(Procedure procedure){
        procedureList.remove(procedure);
    }

    public void addProvider(Provider provider){
        providerList.add(Provider);
    }

    public void removeProvider(Provider provider){
        providerList.remove(provider);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }





//    private void saveHistory(){
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
//            out.writeObject(this.transactions);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void loadHistory()  {
//        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
//            this.transactions = (TransactionHistory) in.readObject();
//        }catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }


}
