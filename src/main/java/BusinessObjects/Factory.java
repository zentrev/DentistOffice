package BusinessObjects;

import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderImp;
import BusinessObjects.User.Administrator;
import BusinessObjects.User.StanderdUser;
import BusinessObjects.User.User;
import BusinessObjects.User.UserImp;

public class Factory {

    public static Provider getProviderInstance() {
        return new ProviderImp();
    }

    public static Provider getProviderInstance(String firstName,String lastName, String title, int id){
        return new ProviderImp(firstName,lastName, title, id);
    }

    public static User getStandardUserInstance(){return new StanderdUser();}

    public static User getStandardUserInstance(String userName,String password, String firstName, String lastName){
        return new Administrator(userName,password, firstName, lastName);
    }

    public static User getAdministratorUserInstance(){return new Administrator();}

    public static User getAdministratorUserInstance(String userName,String password, String firstName, String lastName){
        return new Administrator(userName,password, firstName, lastName);
    }




}
