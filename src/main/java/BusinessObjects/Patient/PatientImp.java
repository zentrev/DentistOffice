package BusinessObjects.Patient;

import BusinessObjects.Appointment.AppointmentList;

public class PatientImp {

    private String name;

    private int id;

    private long phoneNumber;

    private String emailAddress;

    private int groupId;

    private int memberId;

    private long paymentCard;

    private AppointmentList appointments;

    public PatientImp(){}

    public PatientImp(String name, int id, long phoneNumber, String emailAddress, int groupId,
                      int memberId, long paymentCard, AppointmentList appointments){
        this.setName(name);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setGroupId(groupId);
        this.setMemberId(memberId);
        this.setPaymentCard(paymentCard);
        this.setAppointments(appointments);

    }

    public PatientImp(String name, int id, long phoneNumber, String emailAddress, int groupId,
                      int memberId, AppointmentList appointments){

        this.setName(name);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setGroupId(groupId);
        this.setMemberId(memberId);
        this.setAppointments(appointments);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
