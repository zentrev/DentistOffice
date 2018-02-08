package Controller;

import BusinessObjects.Appointment.Appointment;
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


public class Controller {

    private AppointmentList appointmentList;
    private PatientList patientList;
    private ProcedureList procedureList;
    private ProviderList providerList;
    private UserList userList;

    public final static String UserFileDest = "resources/Users.sav";
    public final static String appointmentFileDest = "resources/Appointment.sav";
    public final static String patientFileDest = "Patient.sav";
    public final static String procedureFileDest = "procedure.sav";
    public final static String providerFileDest = "Provider.sav";

    /**
     * Default constructor for Controller
     */
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


    public AppointmentList getAppointmentList() {
        return appointmentList;
    }

    public PatientList getPatientList() {
        return patientList;
    }

    public ProcedureList getProcedureList() {
        return procedureList;
    }

    public ProviderList getProviderList() {
        return providerList;
    }

    public UserList getUserList() {
        return userList;
    }


    public String saveAll(){
        saveUsers();
        saveAppointments();
        savePatients();
        saveProcedures();
        saveProviders();
        return "Data Saved...";
    }

    public String loadAll(){
        loadUsers();
        loadAppointments();
        loadPatients();
        loadProcedures();
        loadProviders();
        return "Data Loaded...";
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

    public void saveAppointments(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(appointmentFileDest))){
            out.writeObject(this.appointmentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadAppointments()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(appointmentFileDest))){
            this.appointmentList = (AppointmentList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void savePatients(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(patientFileDest))){
            out.writeObject(this.patientList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadPatients()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientFileDest))){
            this.patientList = (PatientList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveProcedures(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(procedureFileDest))){
            out.writeObject(this.procedureList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProcedures()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(procedureFileDest))){
            this.procedureList = (ProcedureList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveProviders(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(providerFileDest))){
            out.writeObject(this.providerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProviders()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(providerFileDest))){
            this.providerList = (ProviderList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
