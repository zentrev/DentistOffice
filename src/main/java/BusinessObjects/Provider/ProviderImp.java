package BusinessObjects.Provider;

import BusinessObjects.Procedure.ProcedureImp;

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
        if(firstName == null){
            throw new IllegalArgumentException("cannot be null");
        }
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
        if(lastName == null){
            throw new IllegalArgumentException("cannot be null");
        }
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
        if(title == null){
            throw new IllegalArgumentException("cannot be null");
        }
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
        if(id < 0){
            throw new IllegalArgumentException("cannot be null");
        }
        this.id = id;
    }

    /**
     * Overrides the default toString
     * @return - The title the name and the Id
     */
    @Override
    public String toString(){
        return   "The Title:" + this.getTitle() + " The Name " + this.getFirstName() + " " + this.getLastName() + " The Id: " + this.getId();
    }

    /**
     * Overrides the default equals
     * @param obj - obj
     * @return the same title and id
     */
    @Override
    public boolean equals(Object obj){
        ProviderImp other = (ProviderImp)obj;
        return this.getTitle() == other.getTitle() && this.getId() == other.getId();
    }
}
