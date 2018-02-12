package BusinessObjects.Provider;

import BusinessObjects.Procedure.Procedure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProviderList extends ArrayList<Provider> implements Serializable{

    /**
     * sorts providerList by FirstName
     */
    public void sortProviderFirstName(){
        Collections.sort(this, new Comparator<Provider>(){
            @Override
            public int compare(Provider o1, Provider o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    /**
     * sorts providerList by LastName
     */
    public void sortProviderLastName(){
        Collections.sort(this, new Comparator<Provider>(){
            @Override
            public int compare(Provider o1, Provider o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    /**
     * sorts providerList by title
     */
    public void sortProviderTitle(){
        Collections.sort(this, new Comparator<Provider>(){
            @Override
            public int compare(Provider o1, Provider o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

}
