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


    public final static String UserFileDest = "src/main/resources/Users.sav";
    public final static String appointmentFileDest = "src/main/resources/Appointment.sav";
    public final static String patientFileDest = "src/main/resources/Patient.sav";
    public final static String procedureFileDest = "src/main/resources/procedure.sav";
    public final static String providerFileDest = "src/main/resources/Provider.sav";

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
    public String loadAll() throws IOException,ClassNotFoundException{
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
    public void saveUsers() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(UserFileDest));
        out.writeObject(this.userList);
    }

    /**
     * Loads the userList form a file
     */
    public void loadUsers() throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(UserFileDest));
        this.userList = (UserList) in.readObject();
    }

    /**
     * Saves the appointmentList to a file
     */
    public void saveAppointments() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(appointmentFileDest));
        out.writeObject(this.appointmentList);
    }

    /**
     * Loads the appointmentList from a file
     */
    public void loadAppointments() throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(appointmentFileDest));
        this.appointmentList = (AppointmentList) in.readObject();
    }

    /**
     * Saves the patientList to a file
     */
    public void savePatients() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(patientFileDest));
        out.writeObject(this.patientList);
    }

    /**
     * Loads the patientList form a file
     */
    public void loadPatients() throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientFileDest));
        this.patientList = (PatientList) in.readObject();
    }

    /**
     * Saves the procedureList to a file
     */
    public void saveProcedures() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(procedureFileDest));
        out.writeObject(this.procedureList);
    }

    /**
     * Loads the procedureList from a file
     */
    public void loadProcedures() throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(procedureFileDest));
        this.procedureList = (ProcedureList) in.readObject();
    }

    /**
     * Saves the providerList to a file
     */
    public void saveProviders() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(providerFileDest));
        out.writeObject(this.providerList);
    }

    /**
     * Loads the providerList from a file
     */
    public void loadProviders() throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(providerFileDest));
        this.providerList = (ProviderList) in.readObject();
    }
}
