package BusinessObjects.User;

import java.io.Serializable;

/**
 * Interface the User can use
 */
public interface User {

    /**
     * gets the set userName
     * @return - gets the set userName
     */
    public String getUserName();

    /**
     * sets the userName
     * @param userName - sets the userName
     */
    public void setUserName(String userName);

    /**
     * gets the set password
     * @return - the set password
     */
    public String getPassword();

    /**
     * sets the password
     * @param password - the set password
     */
    public void setPassword(String password);

    /**
     * gets the set password
     * @return - the set password
     */
    public String getFirstName();

    /**
     * sets the firstName
     * @param firstName - the set firstName
     */
    public void setFirstName(String firstName);

    /**
     * gets the set lastName
     * @return - the set lastName
     */
    public String getLastName();

    /**
     * sets the lastName
     * @param lastName - set lastName
     */
    public void setLastName(String lastName);

    /**
     * Overrides the default toString
     * @return - The UserName the password and the name
     */
    @Override
    public String toString();

    /**
     * Overrides the default equals
     * @param obj - obj
     * @return the same password
     */
    @Override
    public boolean equals(Object obj);
}
