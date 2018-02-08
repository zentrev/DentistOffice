package BusinessObjects.Provider;

import java.io.Serializable;

public class ProviderImp implements Provider, Serializable {

    private String firstName;

    private String lastName;

    private String title;

    private int id;

    public ProviderImp() {}

    public ProviderImp(String firstName, String lastName, String title, int id){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setTitle(title);
        this.setId(id);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

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
