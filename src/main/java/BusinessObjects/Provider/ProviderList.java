package BusinessObjects.Provider;

import BusinessObjects.Procedure.Procedure;
import BusinessObjects.User.User;

import java.io.Serializable;
import java.util.*;

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

    /**
     * returns a provider map
     * @return - map of providers
     */
    public Map<Integer, Provider> getProviderMap(){
        sortProviderTitle();
        Map<Integer,Provider> map = new HashMap<>();
        for(int i = 0; i<this.size(); i++){
            map.put(i, this.get(i));
        }
        return map;
    }

}
