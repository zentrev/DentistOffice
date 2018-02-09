package BusinessObjects.Provider;

/**
 * gets the Provider info
 */
public interface Provider {

    /**
     * gets the firstName
     * @return - gets the set firstName
     */
    public String getFirstName();

    /**
     * sets the firstName
     * @param firstName - sets the firstName
     */
    public void setFirstName(String firstName);

    /**
     * gets the set lastName
     * @return - gets the lastName
     */
    public String getLastName();

    /**
     * set the lastName
     * @param lastName - sets the lastName
     */
    public void setLastName(String lastName);

    /**
     * gets the set title
     * @return - gets the set title
     */
    public String getTitle();

    /**
     * sets the tittle
     * @param title - sets the title
     */
    public void setTitle(String title);

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
     * Overrides the default toString
     * @return - The title the name and the Id
     */
    @Override
    public String toString();

    /**
     * Overrides the default equals
     * @param obj - obj
     * @return the same title and id
     */
    @Override
    public boolean equals(Object obj);

}
