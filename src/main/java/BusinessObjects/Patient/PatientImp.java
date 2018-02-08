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
        this.setInserance(inserance);

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
        this.setInserance(inserance);

    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public long getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(long paymentCard) {
        this.paymentCard = paymentCard;
    }

    public AppointmentList getAppointments() {
        return appointments;
    }

    public void setAppointments(AppointmentList appointments) {
        this.appointments = appointments;
    }

    public String getInserance() {
        return inserance;
    }

    public void setInserance(String inserance) {
        this.inserance = inserance;
    }
}
