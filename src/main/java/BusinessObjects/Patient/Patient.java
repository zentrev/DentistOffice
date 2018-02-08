package BusinessObjects.Patient;

import BusinessObjects.Appointment.AppointmentList;

public interface Patient {

    /**
     * gets the set firstName
     * @return - the set first name
     */
    public String getFirstName();

    /**
     * sets the first name
     * @param firstName - sets the first name
     */
    public void setFirstName(String firstName);

    /**
     * gets the set last name
     * @return - gets the set last name
     */
    public String getLastName();

    /**
     * sets the last name
     * @param lastName - sets the last name
     */
    public void setLastName(String lastName);

    /**
     * gets the set id
     * @return - gets the set id
     */
    public int getId();

    /**
     * sets the id
     * @param id - sets the id
     */
    public void setId(int id);

    /**
     * gets the set phone number
     * @return - gets the set phone number
     */
    public long getPhoneNumber();

    /**
     * sets the phone number
     * @param phoneNumber - sets the phone number
     */
    public void setPhoneNumber(long phoneNumber);

    /**
     * gets the set email
     * @return - gets the set Emails Address
     */
    public String getEmailAddress();

    /**
     * sets the emailAddress
     * @param emailAddress - sets the emailAddress
     */
    public void setEmailAddress(String emailAddress);

    /**
     * gets the set groupId
     * @return - gets the set groupId
     */
    public int getGroupId();

    /**
     * sets the groupId
     * @param groupId - sets the GroupID
     */
    public void setGroupId(int groupId);

    /**
     * gets the set MemberId
     * @return - gets the set MemberID
     */
    public int getMemberId();

    /**
     * sets the MemberId
     * @param memberId - sets the MemberId
     */
    public void setMemberId(int memberId);

    /**
     * gets the set PaymentCard
     * @return - gets the set PaymentCard
     */
    public long getPaymentCard() ;

    /**
     * set the paymentCard
     * @param paymentCard - sets the Payment Card
     */
    public void setPaymentCard(long paymentCard);

    /**
     * gets the set Appointments
     * @return - gets the set appointments
     */
    public AppointmentList getAppointments() ;

    /**
     * sets Appointments
     * @param appointments - sets the appointments
     */
    public void setAppointments(AppointmentList appointments);

    /**
     * gets the set Inserance
     * @return - gets the set Inserance
     */
    public String getInserance();

    /**
     * sets the Inserance
     * @param inserance - sets the Inserance
     */
    public void setInserance(String inserance);
}
