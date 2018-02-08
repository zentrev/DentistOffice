package BusinessObjects.Patient;

import BusinessObjects.Appointment.AppointmentList;

public interface Patient {

    public String getName();

    public void setName(String name);

    public int getId();

    public void setId(int id);

    public long getPhoneNumber();

    public void setPhoneNumber(long phoneNumber);

    public String getEmailAddress();

    public void setEmailAddress(String emailAddress);

    public int getGroupId();

    public void setGroupId(int groupId);

    public int getMemberId();

    public void setMemberId(int memberId);

    public long getPaymentCard() ;

    public void setPaymentCard(long paymentCard);

    public AppointmentList getAppointments() ;

    public void setAppointments(AppointmentList appointments);
}
