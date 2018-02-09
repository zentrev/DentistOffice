package BusinessObjects.Procedure;

import BusinessObjects.Provider.Provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * List of Procedures
 */
public class ProcedureList extends ArrayList<ProcedureImp> implements Serializable{

    /**
     * sorts procedureList by procedureCode
     */
    public void sortProcedureCode(){
        Collections.sort(this, new Comparator<ProcedureImp>() {
            @Override
            public int compare(ProcedureImp o1, ProcedureImp o2) {
                return o1.getProcedureCode().compareTo(o2.getProcedureCode());
            }
        });
    }

}
