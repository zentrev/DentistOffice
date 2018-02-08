package BusinessObjects.User;

import java.io.Serializable;

abstract public class UserImp implements User, Serializable{

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    public UserImp(){}

    public UserImp(String userName, String password, String firstName, String lastName){
        this.setUserName(userName);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}