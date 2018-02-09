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
    /**
     * Overrides the default toString
     * @return - The UserName the password and the name
     */
    @Override
    public String toString(){
        return super.toString();
    }

    /**
     * Overrides the default equals
     * @param obj - obj
     * @return the same password
     */
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
}
