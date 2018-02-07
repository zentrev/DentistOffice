package BusinessObjects.Provider;

public class ProviderFactory {

    public static Provider getInstance() {
        return new ProviderImp();
    }

    public static Provider getInstance(String lastName, String firstName, String title, int id){
        return new ProviderImp(lastName, firstName, title, id);
    }

}
