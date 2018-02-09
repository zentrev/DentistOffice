package BusinessObjects.Provider;

import java.io.Serializable;

/**
 * class that makes a Provider
 */
public class ProviderImp implements Provider, Serializable {

    private String firstName;

    private String lastName;

    private String title;

    private int id;

    /**
     * Default Constructor
     */
    public ProviderImp() {}

    /**
     * Overloaded Constructor that takes in a firstName, lastName, title, and id
     * @param firstName - sets the firstName
     * @param lastName - sets the LastName
     * @param title - Sets the title
     * @param id - sets the id
     */
    public ProviderImp(String firstName, String lastName, String title, int id){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setTitle(title);
        this.setId(id);

    }

    /**
     * gets the set firstName
     * @return - the set firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets the firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * gets the set lastName
     * @return - the set lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * set the lastName
     * @param lastName - sets the lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * gets the set title
     * @return - the set title
     */
    public String getTitle() {
        return title;
    }

    /**
     * sets the tittle
     * @param title - the set title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * gets the set id
     * @return - the set id
     */
    public int getId() {
        return id;
    }

    /**
     * sets the id
     * @param id - the set id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return   "Title " + this.getTitle() + "Id: " + this.getId();
    }
    @Override
    public boolean equals(Object obj){
        ProviderImp other = (ProviderImp)obj;
        return true;
    }
}
