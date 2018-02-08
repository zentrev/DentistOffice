package BusinessObjects.Patient;

import BusinessObjects.Appointment.AppointmentList;

import java.io.Serializable;

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

    public PatientImp(){}

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
