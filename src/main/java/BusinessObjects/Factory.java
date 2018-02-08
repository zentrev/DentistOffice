package BusinessObjects;

import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderImp;

public class Factory {

    public static Provider getProviderInstance() {
        return new ProviderImp();
    }

    public static Provider getPrviderInstanceInstance(String lastName, String firstName, String title, int id){
        return new ProviderImp(lastName, firstName, title, id);
    }

}
