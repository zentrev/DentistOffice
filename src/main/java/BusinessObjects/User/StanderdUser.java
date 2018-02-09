package BusinessObjects.User;

import java.io.Serializable;

/**
 * child class that extends UserImp
 */
public class StanderdUser extends UserImp {

    public StanderdUser(){}

    public StanderdUser(String userName, String password, String firstName, String lastName){
        super(userName, password,firstName,lastName);
    }
}
