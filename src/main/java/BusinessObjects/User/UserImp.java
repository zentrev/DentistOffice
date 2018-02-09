package BusinessObjects.User;

import java.io.Serializable;

/**
 * Class that makes a User
 */
abstract public class UserImp implements User, Serializable{

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    /**
     * default Constructor
     */
    public UserImp(){}

    /**
     * Overloaded Constructor that takes in a userName, password, firstName, lastName
     * @param userName - sets the userName
     * @param password - sets the password
     * @param firstName - sets the firstName
     * @param lastName - sets the lastName
     */
    public UserImp(String userName, String password, String firstName, String lastName){
        this.setUserName(userName);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    /**
     * gets the set userName
     * @return - the set userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * sets the userName
     * @param userName - set userName
     */
    public void setUserName(String userName) {
        if(userName == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.userName = userName;
    }

    /**
     * gets the set password
     * @return - gets the set password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets the password
     * @param password - sets the password
     */
    public void setPassword(String password) {
        if(password == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.password = password;
    }

    /**
     * gets the set firstName
     * @return - get the set firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets the firstname
     * @param firstName - set the firstName
     */
    public void setFirstName(String firstName) {
        if(firstName == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.firstName = firstName;
    }

    /**
     * gets the set lastName
     * @return - gets the set lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets the lastName
     * @param lastName - sets the lastName
     */
    public void setLastName(String lastName) {
        if(lastName == null){
            throw new IllegalArgumentException("cannot be null");
        }
        this.lastName = lastName;
    }
}
