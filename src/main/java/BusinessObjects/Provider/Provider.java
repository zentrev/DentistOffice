package BusinessObjects.Provider;

public interface Provider {

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getLastName();

    public void setLastName(String lastName);

    public String getTitle();

    public void setTitle(String title);

    public int getId();

    public void setId(int id);

    public String toString();

    public boolean equals(Object obj);

}
