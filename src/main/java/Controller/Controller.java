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
    public String loadAll() throws IOException, ClassNotFoundException {
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
    public void loadUsers() throws ClassNotFoundException{
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(UserFileDest));
            this.userList = (UserList) in.readObject();
        } catch (IOException e) {
            try {
                saveUsers();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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
    public void loadAppointments() throws ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(appointmentFileDest));
            this.appointmentList = (AppointmentList) in.readObject();
        } catch (IOException e) {
            try {
                saveAppointments();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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
    public void loadPatients() throws ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(patientFileDest));
            this.patientList = (PatientList) in.readObject();
        } catch (IOException e) {
            try {
                savePatients();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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
    public void loadProcedures() throws ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(procedureFileDest));
            this.procedureList = (ProcedureList) in.readObject();
        } catch (IOException e) {
            try {
                saveProcedures();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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
    public void loadProviders() throws ClassNotFoundException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(providerFileDest));
            this.providerList = (ProviderList) in.readObject();
        } catch (IOException e) {
            try {
                saveProviders();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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

        for(Provider provide : providerList){
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

        for(Patient patient : patientList){
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
        for(Procedure procedure : procedureList){
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

        for(Appointment appointment : appointmentList){
            date = true;
            if(appointment.getDate().before(minTime) || appointment.getDate().after(maxTime)){
                date = false;
            }
            proced = true;
            provid = true;
            for(Procedure procedure : appointment.getProcedures()){
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
        for(Patient patient : patientList){
            for(Appointment appointment : patient.getAppointments()){
                if(appointment.getDate().before(end) && appointment.getDate().after(start)) {
                    allAppointments.add(appointment);
                }
            }
        }
        while(counter.before(end)){
            cash = 0;
            for(Appointment appointment : allAppointments){
                if(appointment.getDate().after(counter) && appointment.getDate().before(step)){
                    for(Procedure procedure : appointment.getProcedures()){
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

    /**
     * sorts patents and balances by patents name
     * @param sortFirstName - True if you want to sort by first name false to sort by last name
     * @return - a hash map of patents and balances due
     */
    public Map<Patient, Double> sortBalenceByName(boolean sortFirstName){
        Map<Patient, Double> map = getBalances();
        List<Patient> keys = new LinkedList<Patient>(map.keySet());
        if(sortFirstName) {
            Collections.sort(keys, new Comparator<Patient>() {
                @Override
                public int compare(Patient o1, Patient o2) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }

            });
        }else{
            Collections.sort(keys, new Comparator<Patient>() {
                @Override
                public int compare(Patient o1, Patient o2) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }

            });
        }
        Map<Patient,Double> sortedMap = new LinkedHashMap<Patient,Double>();
        for(Patient key: keys){
            sortedMap.put(key, map.get(key));
        }
        return sortedMap;
    }

    /**
     * returns a hash map with patients and there balances in no particular order
     * @return - hash map of patents and balances
     */
    public Map<Patient, Double> getBalances(){
        Map<Patient, Double> balance = new HashMap<>();
        double procedureTotal = 0;
        double balanceDue;

        for(Patient patient : patientList){
            for(Appointment appointment : patient.getAppointments()){
                for(Procedure procedure : appointment.getProcedures()){
                    procedureTotal += procedure.getAmountCharged();
                }
            }
            balanceDue = procedureTotal - patient.getPaymentsMade();
            balance.put(patient, balanceDue);
        }
        return balance;
    }

}
