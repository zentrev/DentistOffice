package BusinessObjects;

import BusinessObjects.Appointment.Appointment;
import BusinessObjects.Appointment.AppointmentImp;
import BusinessObjects.Appointment.AppointmentList;
import BusinessObjects.Patient.Patient;
import BusinessObjects.Patient.PatientImp;
import BusinessObjects.Procedure.Procedure;
import BusinessObjects.Procedure.ProcedureImp;
import BusinessObjects.Procedure.ProcedureList;
import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderImp;
import BusinessObjects.User.Administrator;
import BusinessObjects.User.StanderdUser;
import BusinessObjects.User.User;

import java.util.Calendar;

public class Factory {

    public static Provider getProviderInstance() {
        return new ProviderImp();
    }

    public static Provider getProviderInstance(String firstName,String lastName, String title, int id){
        return new ProviderImp(firstName,lastName, title, id);
    }

    public static User getStandardUserInstance(){return new StanderdUser();}

    public static User getStandardUserInstance(String userName,String password, String firstName, String lastName){
        return new StanderdUser(userName,password, firstName, lastName);
    }

    public static User getAdministratorUserInstance(){return new Administrator();}

    public static User getAdministratorUserInstance(String userName,String password, String firstName, String lastName){
        return new Administrator(userName,password, firstName, lastName);
    }

    public static Appointment getAppointmentInstance() { return new AppointmentImp();}

    public static Appointment getAppointmentInsance(Patient patient, ProcedureList procedures, Calendar date){
        return new AppointmentImp(patient,procedures,date);
    }

    public static Patient getPatientInstance(){return new PatientImp();}

    public static Patient getPatienInstance(String firstName, String lastName, int id, long phoneNumber, String emailAddress, int groupId,
                                            int memberId, AppointmentList appointments, String inserance){
        return new PatientImp(firstName,lastName,id,phoneNumber,emailAddress,groupId,memberId,appointments,inserance);
    }

    public static Procedure getProcedureInstance() { return new ProcedureImp();}

    public static Procedure getProcedureInstance(Provider provider, String procedureCode, String procedureDescription, double standardCharge, double amountCharged){
        return new ProcedureImp(provider,procedureCode,procedureDescription,standardCharge,amountCharged);
    }

    public static Procedure getProcedureInstance(Provider provider, String procedureCode, String procedureDescription, double standardCharge){
        return new ProcedureImp(provider,procedureCode,procedureDescription,standardCharge);
    }

    }
