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

    /**
     * Adds an appointment to our appointmentList
     * @param appointment - appointment you would like to add
     */
    public void addAppointment(Appointment appointment){
        appointmentList.add(appointment);
    }

    /**
     * Removes an appointment from our appointmentList
     * @param appointment - appointment you would like to remove
     */
    public void removeAppointment(Appointment appointment){
        appointmentList.remove(appointment);
    }

    /**
     * Adds a patient to our patientList
     * @param patient - patient you would like to add
     */
    public void addPatient(Patient patient){
        patientList.add(patient);
    }

    /**
     * Removes a patient from out patientList
     * @param patient - patient you would like to remove
     */
    public void removePatient(Patient patient){
        patientList.remove(patient);
    }

    /**
     * Adds a procedure to our procedureList
     * @param procedure - procedure you would like to add
     */
    public void addProcedure(Procedure procedure){
        procedureList.add(procedure);
    }

    /**
     * Removes a procedure from our procedureList
     * @param procedure - Procedure you would like to remove
     */
    public void removeProcedure(Procedure procedure){
        procedureList.remove(procedure);
    }

    /**
     * Adds a provider to our providerList
     * @param provider - provider you would like to add
     */
    public void addProvider(Provider provider){
        providerList.add(provider);
    }

    /**
     * Removes a provider from our procedureList
     * @param provider - procedure you would like to remove
     */
    public void removeProvider(Provider provider){
        providerList.remove(provider);
    }

    /**
     * Adds a user to our userList
     * @param user - user you would like to add
     */
    public void addUser(User user){
        userList.add(user);
    }

    /**
     * Removes a user from our userList
     * @param user - user you would like to remove
     */
    public void removeUser(User user){
        userList.remove(user);
    }


    /**
     * @return - the appointmentList that holds all our appointments
     */
    public AppointmentList getAppointmentList() {
        return appointmentList;
    }

    /**
     * @return - the patientList that holds all our patients
     */
    public PatientList getPatientList() {
        return patientList;
    }

    /**
     * @return - the procedureList that holds all our procedures
     */
    public ProcedureList getProcedureList() {
        return procedureList;
    }

    /**
     * @return - the providerList that holds all our providers
     */
    public ProviderList getProviderList() {
        return providerList;
    }

    /**
     * @return - the userList that holds all our users
     */
    public UserList getUserList() {
        return userList;
    }


    /**
     * Saves all our List to files
     * @return - Confirmation that the data saved
     */
    public String saveAll(){
        saveUsers();
        saveAppointments();
        savePatients();
        saveProcedures();
        saveProviders();
        return "Data Saved...";
    }

    /**
     * Loades all our List from our files
     * @return - Confirmation that the data loaded
     */
    public String loadAll(){
        loadUsers();
        loadAppointments();
        loadPatients();
        loadProcedures();
        loadProviders();
        return "Data Loaded...";
    }

    /**
     * Saves the userList to a file
     */
    public void saveUsers(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(UserFileDest))){
            out.writeObject(this.userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the userList form a file
     */
    public void loadUsers()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(UserFileDest))){
            this.userList = (UserList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the appointmentList to a file
     */
    public void saveAppointments(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(appointmentFileDest))){
            out.writeObject(this.appointmentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the appointmentList from a file
     */
    public void loadAppointments()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(appointmentFileDest))){
            this.appointmentList = (AppointmentList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the patientList to a file
     */
    public void savePatients(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(patientFileDest))){
            out.writeObject(this.patientList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the patientList form a file
     */
    public void loadPatients()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientFileDest))){
            this.patientList = (PatientList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the procedureList to a file
     */
    public void saveProcedures(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(procedureFileDest))){
            out.writeObject(this.procedureList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the procedureList from a file
     */
    public void loadProcedures()  {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(procedureFileDest))){
            this.procedureList = (ProcedureList) in.readObject();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the providerList to a file
     */
    public void saveProviders(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(providerFileDest))){
            out.writeObject(this.providerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the providerList from a file
     */
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
