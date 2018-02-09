package BusinessObjects;

import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderImp;

public class Factory {

    public static Provider getProviderInstance() {
        return new ProviderImp();
    }

    public static Provider getPrviderInstanceInstance(String firstName,String lastName, String title, int id){
        return new ProviderImp(firstName,lastName, title, id);
    }

}
