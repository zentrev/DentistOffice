package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

}
