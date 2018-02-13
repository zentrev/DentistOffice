package BusinessObjects.Procedure;

import BusinessObjects.Patient.Patient;
import BusinessObjects.Provider.Provider;

import java.io.Serializable;
import java.util.*;

/**
 * List of Procedures
 */
public class ProcedureList extends ArrayList<Procedure> implements Serializable{

    /**
     * sorts procedureList by procedureCode
     */
    public void sortProcedureCode(){
        Collections.sort(this, new Comparator<Procedure>() {
            @Override
            public int compare(Procedure o1, Procedure o2) {
                return o1.getProcedureCode().compareTo(o2.getProcedureCode());
            }
        });
    }

    /**
     * gets a map of procedures
     * @return - map of procedures
     */
    public Map<Integer, Procedure> getProcedurMap(){
        sortProcedureCode();
        Map<Integer,Procedure> map = new HashMap<>();
        for(int i = 0; i<this.size(); i++){
            map.put(i, this.get(i));
        }
        return map;
    }

}
