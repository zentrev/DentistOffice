package BusinessObjects;

import BusinessObjects.Provider.Provider;
import BusinessObjects.Provider.ProviderImp;

public class Factory {

    public static Provider getProviderInstance() {
        return new ProviderImp();
    }

    public static Provider getPrviderInstanceInstance(String name, String title, int id){
        return new ProviderImp(name, title, id);
    }

}
