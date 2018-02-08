package BusinessObjects.Provider;

import java.io.Serializable;

public class ProviderImp implements Provider, Serializable {

    private String name;

    private String title;

    private int id;

    public ProviderImp() {}

    public ProviderImp(String name, String title, int id){
        this.setName(name);
        this.setTitle(title);
        this.setId(id);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
