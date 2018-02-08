package Controller;

import BusinessObjects.Appointment.Appointment;
import BusinessObjects.Appointment.AppointmentImp;
import BusinessObjects.Appointment.AppointmentList;
import BusinessObjects.Patient.Patient;
import BusinessObjects.Patient.PatientList;
import BusinessObjects.Procedure.Procedure;
import BusinessObjects.Procedure.ProcedureList;
import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderList;
import BusinessObjects.User.User;
import BusinessObjects.User.UserList;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Controller {

    private AppointmentList appointmentList;
    private PatientList patientList;
    private ProcedureList procedureList;
    private ProviderList providerList;
    private UserList userList;

    public final static String UserFileDest = "resources/Users.sav";

    public Controller(){
        appointmentList = new AppointmentList();
        patientList = new PatientList();
        procedureList = new ProcedureList();
        providerList = new ProviderList();
        userList = new UserList();
        this.loadAll();
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
        providerList.add(provider);
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

    public void saveAll(){
        this.saveUsers();
    }

    public void loadAll(){
        loadUsers();
    }

    public void saveUsers(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(UserFileDest))){
            out.writeObject(this.userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadUsers()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(UserFileDest))){
            this.userList = (UserList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
