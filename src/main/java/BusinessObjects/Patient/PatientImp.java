package BusinessObjects.Patient;

import BusinessObjects.Appointment.AppointmentList;

import java.io.Serializable;

/**
 * Class thta makes Patiens
 */
public class PatientImp implements Patient, Serializable{

    private String firstName;

    private String lastName;

    private int id;

    private long phoneNumber;

    private String emailAddress;

    private int groupId;

    private int memberId;

    private long paymentCard;

    private AppointmentList appointments;

    private String inserance;

    private double paymentsMade;

    /**
     * Default Constructor
     */
    public PatientImp(){}

    /**
     * Overloaded Constructor that takes in firstName, lastName, id, emailAddress, groupId, MemberId, paymentCard, appointments, inserance
     * @param firstName - sets the firstName
     * @param lastName - sets the lastName
     * @param id - sets the id
     * @param phoneNumber - sets the phoneNumber
     * @param emailAddress - sets the emailsAddress
     * @param groupId - sets the groupId
     * @param memberId - sets the numberId
     * @param paymentCard - sets the paymentCard
     * @param appointments - sets the appointments
     * @param inserance- sets the appointment
     */
    public PatientImp(String firstName, String lastName, int id, long phoneNumber, String emailAddress, int groupId,
                      int memberId, long paymentCard, AppointmentList appointments, String inserance){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setGroupId(groupId);
        this.setMemberId(memberId);
        this.setPaymentCard(paymentCard);
        this.setAppointments(appointments);
        this.setInsurance(inserance);

    }

    /**
     * Overloaded Constructor that takes in firstName, lastName, id, emailAddress, groupId, inserance
     * @param firstName - sets the firstName
     * @param lastName - sets the lastName
     * @param id - sets the id
     * @param phoneNumber - sets the phoneNumber
     * @param emailAddress - sets the emailAddress
     * @param groupId - sets the groupId
     * @param memberId - sets the memberId
     * @param appointments - sets the appointments
     * @param inserance - sets the insertance
     */
    public PatientImp(String firstName, String lastName, int id, long phoneNumber, String emailAddress, int groupId,
                      int memberId, AppointmentList appointments, String inserance){

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setGroupId(groupId);
        this.setMemberId(memberId);
        this.setAppointments(appointments);
        this.setInsurance(inserance);

    }

    /**
     *Gets the firstName
     * @return - the set first Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the First Name
     * @param firstName - sets the first Name
     */
    public void setFirstName(String firstName) {
        if(firstName == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.firstName = firstName;
    }

    /**
     * gets the set last name
     * @return - the set last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets the last name
     * @param lastName - sets the last name
     */
    public void setLastName(String lastName) {
        if(lastName == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.lastName = lastName;
    }

    /**
     * gets the set id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * sets the id
     * @param id - sets the id
     */
    public void setId(int id) {
        if(id < 0){
            throw new IllegalArgumentException("cannont be less then zero");
        }
        this.id = id;
    }

    /**
     * gets the set phone number
     * @return - gets the set phone number
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets the phone number
     * @param phoneNumber - sets the phone number
     */
    public void setPhoneNumber(long phoneNumber) {
        if(phoneNumber < 0){
            throw new IllegalArgumentException("Cannont be less then zero");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * gets the set EmailAddress
     * @return - gets the set Email
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * sets the Email
     * @param emailAddress - sets the Email
     */
    public void setEmailAddress(String emailAddress) {
        if(emailAddress == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.emailAddress = emailAddress;
    }

    /**
     * gets set GroupId
     * @return - gets the set GroupId
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * sets the GroupId
     * @param groupId - sets the GrouopId
     */
    public void setGroupId(int groupId) {
        if(groupId < 0){
            throw new IllegalArgumentException("cannot be less then zero");
        }
        this.groupId = groupId;
    }

    /**
     * gets the set MemberId
     * @return - gets the set MemberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * sets the MemberId
     * @param memberId - set the MemberId
     */
    public void setMemberId(int memberId) {
        if(memberId < 0){
            throw new IllegalArgumentException("cannont be less then zero");
        }
        this.memberId = memberId;
    }

    /**
     * gets the set PaymentCard
     * @return
     */
    public long getPaymentCard() {
        return paymentCard;
    }

    /**
     * sets PaymentCard
     * @param paymentCard - sets paymentCard
     */
    public void setPaymentCard(long paymentCard) {
        if(paymentCard < 0 || paymentCard > 16){
            throw new IllegalArgumentException("Cannont be less then zero or more then 16");
        }
        this.paymentCard = paymentCard;
    }

    /**
     * gets the set Appoinments
     * @return
     */
    public AppointmentList getAppointments() {
        return appointments;
    }

    /**
     * sets the Appointments
     * @param appointments - sets the Appointments
     */
    public void setAppointments(AppointmentList appointments) {
        if(appointments == null){
            throw new IllegalArgumentException("cannont be null");
        }
        this.appointments = appointments;
    }

    /**
     * gets the set inserance
     * @return - gets the set inserance
     */
    public String getInsurance() {
        return inserance;
    }

    /**
     * sets the inserance
     * @param inserance - sets the inserance
     */
    public void setInsurance(String inserance) {
        if(inserance == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.inserance = inserance;
    }

    /**
     * gets the payments made
     * @return - the payments made
     */
    public double getPaymentsMade() {
        return paymentsMade;
    }

    /**
     * sets the payments made
     * @param payments - set the payments made
     */
    public void setPaymentsMade(double payments) {
        if(payments < 0){
            throw new IllegalArgumentException("cannot be less than zero");
        }
        paymentsMade = payments;
    }


    /**
     * adds a payment
     * @param payments - adds a payment
     */
    public void addPayment(double payments) {
        if(payments < 0){
            throw new IllegalArgumentException("cannot be less than zero");
        }
        paymentsMade += payments;
    }
}
