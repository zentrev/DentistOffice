package Controller;

import BusinessObjects.Appointment.AppointmentImp;
import BusinessObjects.Appointment.AppointmentList;
import BusinessObjects.Patient.PatientImp;
import BusinessObjects.Patient.PatientList;
import BusinessObjects.Procedure.ProcedureImp;
import BusinessObjects.Procedure.ProcedureList;
import BusinessObjects.Provider.ProviderImp;
import BusinessObjects.Provider.ProviderList;
import BusinessObjects.User.UserImp;
import BusinessObjects.User.UserList;
import java.io.*;
import java.util.*;


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
    public Controller() throws IOException, ClassNotFoundException{
        appointmentList = new AppointmentList();
        patientList = new PatientList();
        procedureList = new ProcedureList();
        providerList = new ProviderList();
        userList = new UserList();
       // this.loadAll();
    }

    /**
     * Adds an appointment to our appointmentList
     * @param appointment - appointment you would like to add
     */
    public void addAppointment(AppointmentImp appointment){
        appointmentList.add(appointment);
    }

    /**
     * Removes an appointment from our appointmentList
     * @param appointment - appointment you would like to remove
     */
    public void removeAppointment(AppointmentImp appointment){
        appointmentList.remove(appointment);
    }

    /**
     * Adds a patient to our patientList
     * @param patient - patient you would like to add
     */
    public void addPatient(PatientImp patient){
        patientList.add(patient);
    }

    /**
     * Removes a patient from out patientList
     * @param patient - patient you would like to remove
     */
    public void removePatient(PatientImp patient){
        patientList.remove(patient);
    }

    /**
     * Adds a procedure to our procedureList
     * @param procedure - procedure you would like to add
     */
    public void addProcedure(ProcedureImp procedure){
        procedureList.add(procedure);
    }

    /**
     * Removes a procedure from our procedureList
     * @param procedure - Procedure you would like to remove
     */
    public void removeProcedure(ProcedureImp procedure){
        procedureList.remove(procedure);
    }

    /**
     * Adds a provider to our providerList
     * @param provider - provider you would like to add
     */
    public void addProvider(ProviderImp provider){
        providerList.add(provider);
    }

    /**
     * Removes a provider from our procedureList
     * @param provider - procedure you would like to remove
     */
    public void removeProvider(ProviderImp provider){
        providerList.remove(provider);
    }

    /**
     * Adds a user to our userList
     * @param user - user you would like to add
     */
    public void addUser(UserImp user){
        userList.add(user);
    }

    /**
     * Removes a user from our userList
     * @param user - user you would like to remove
     */
    public void removeUser(UserImp user){
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
    public String saveAll() throws IOException{
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


    /**
     * Searches the providerList for providers with matching first chars, leave empty or null to get all for that field
     * @param firstName - First name you chose to search
     * @param lastName - Last name you chose to search
     * @param title - title you chose to search for
     * @return - a ProiderList with the Providers fitting your search
     */
    public ProviderList searchProviders(String firstName, String lastName, String title){
        ProviderList providers = new ProviderList();
        boolean firstNameProviders = true;
        boolean lastNameProviders = true;
        boolean titleProviders = true;

        for(ProviderImp provide : providerList){
            if(firstName != null && firstName != "") {
                for (int i = 0; i < firstName.length(); i++) {
                    if (firstName.toLowerCase().charAt(i) != provide.getFirstName().toLowerCase().charAt(i)) {
                        firstNameProviders = false;
                    }
                }
            }
            if(lastName != null && lastName != "") {
                for (int i = 0; i < lastName.length(); i++) {
                    if (lastName.toLowerCase().charAt(i) != provide.getLastName().toLowerCase().charAt(i)) {
                        lastNameProviders = false;
                    }
                }
            }
            if(title != null && title != "") {
                for (int i = 0; i < title.length(); i++) {
                    if (title.toLowerCase().charAt(i) != provide.getTitle().toLowerCase().charAt(i)) {
                        titleProviders = false;
                    }
                }
            }
            if(firstNameProviders && lastNameProviders && titleProviders) {
                providers.add(provide);
            }
        }
        return providers;
    }

    /**
     * Searches the PatientList for providers with matching first chars, leave empty or null to get all for that field
     * @param firstName - First name you chose to search
     * @param lastName - Last name you chose to search
     * @param insurance - insurance you chose to search for
     * @return - a PatientList with the Patients fitting your search
     */
    public PatientList searchPatients(String firstName, String lastName, String insurance){
        PatientList patients = new PatientList();
        boolean firstNameProviders = true;
        boolean lastNameProviders = true;
        boolean insuranceProviders = true;

        for(PatientImp patient : patientList){
            if(firstName != null && firstName != "") {
                for (int i = 0; i < firstName.length(); i++) {
                    if (firstName.toLowerCase().charAt(i) != patient.getFirstName().toLowerCase().charAt(i)) {
                        firstNameProviders = false;
                    }
                }
            }
            if(lastName != null && lastName != "") {
                for (int i = 0; i < lastName.length(); i++) {
                    if (lastName.toLowerCase().charAt(i) != patient.getLastName().toLowerCase().charAt(i)) {
                        lastNameProviders = false;
                    }
                }
            }
            if(insurance != null && insurance != "") {
                for (int i = 0; i < insurance.length(); i++) {
                    if (insurance.toLowerCase().charAt(i) != patient.getInsurance().toLowerCase().charAt(i)) {
                         insuranceProviders = false;
                    }
                }
            }
            if(firstNameProviders && lastNameProviders && insuranceProviders) {
                patients.add(patient);
            }
        }
        return patients;
    }

    /**
     * Searches a procedureList for a given procedure code
     * @param code - the procedure code your searching for
     * @return - all procedures with the given search results
     */
    public ProcedureList searchProcedure(String code){
        ProcedureList procedures = new ProcedureList();
        for(ProcedureImp procedure : procedureList){
            if(code != null && code != "") {
                for (int i = 0; i < code.length(); i++) {
                    if (code.toLowerCase().charAt(i) != procedure.getProcedureCode().toLowerCase().charAt(i)) {
                        procedures.add(procedure);
                    }
                }
            }
        }
        return procedures;
    }


    /**
     * searches appointments based on filter
     * @param minTime - earliest possible result
     * @param maxTime - latest possible result
     * @param providerFirstName - first name of the provider
     * @param providerLastName - last name of the provider
     * @param providerTitle - title of the provider
     * @param procedureCode - procedure code of the procedure
     * @param patientFirstName - first name of the patient
     * @param patientLastName - last name of the patient
     * @param patientInsurance - insurance of the patient
     * @return - appointmentList of the filtered results
     */
    public AppointmentList searchAppointments(Calendar minTime, Calendar maxTime, String providerFirstName,
                                              String providerLastName, String providerTitle, String procedureCode, String patientFirstName,
                                              String patientLastName, String patientInsurance){
        AppointmentList appointments = new AppointmentList();
        boolean date = true;
        boolean proced = true;
        boolean provid = true;
        boolean patie = true;

        ProviderList providers = searchProviders(providerFirstName,providerLastName,providerTitle);
        PatientList patients = searchPatients(patientFirstName,patientLastName,patientInsurance);

        if(minTime == null){
            minTime = Calendar.getInstance();
            minTime.set(0,0,0,0,0,0);
        }
        if(maxTime == null){
            maxTime = Calendar.getInstance();
            maxTime.set(9999,9999,9999,9999,9999,9999);
        }

        for(AppointmentImp appointment : appointmentList){
            date = true;
            if(appointment.getDate().before(minTime) || appointment.getDate().after(maxTime)){
                date = false;
            }
            proced = true;
            provid = true;
            for(ProcedureImp procedure : appointment.getProcedures()){
                if(!(procedure.getProcedureCode().equals(procedureCode))){
                    proced = true;
                }
                if(!(providers.contains(procedure.getProvider()))){
                    provid = false;
                }
            }
            patie = true;
            if(!(patients.contains(appointment.getPatient()))){
                patie = false;
            }
            if(date && proced && provid && patie){
                appointments.add(appointment);
            }
        }
        return appointments;
    }


    /**
     * makes a map of dates and produced income
     * @param start - starting search date(null for earliest possible date)
     * @param end - end search date (null for latest possible date)
     * @param interval - interval to view by day
     * @return - Map with calendar and Integer
     */
    public Map<Calendar, Double> getProduction(Calendar start, Calendar end, Interval interval){
        Map<Calendar, Double> production = new HashMap<>();
        AppointmentList allAppointments = new AppointmentList();
        allAppointments.sortAppointmentTime();
        Calendar counter = start;
        Calendar step = start;
        double cash;
        step.add(interval.getInterval(), 1);
        if(start == null){
            Calendar temp = Calendar.getInstance();
            temp.set(0,0,0,0,0,0);
            start = temp;
        }
        if(end == null){
            Calendar temp = Calendar.getInstance();
            temp.set(9999,9999,9999,9999,9999,9999);
            start = temp;
        }
        for(PatientImp patient : patientList){
            for(AppointmentImp appointment : patient.getAppointments()){
                if(appointment.getDate().before(end) && appointment.getDate().after(start)) {
                    allAppointments.add(appointment);
                }
            }
        }
        while(counter.before(end)){
            cash = 0;
            for(AppointmentImp appointment : allAppointments){
                if(appointment.getDate().after(counter) && appointment.getDate().before(step)){
                    for(ProcedureImp procedure : appointment.getProcedures()){
                        cash += procedure.getAmountCharged();
                    }
                }
            }
            production.put(counter, cash);
            counter.add(interval.getInterval(), 1);
            step.add(interval.getInterval(), 1);
        }
        return production;
    }

//woorking here
    public Map<PatientImp, Double> getPatientBalance(boolean sortLarge, String firstName, String lastName){
        return null;
    }


}
