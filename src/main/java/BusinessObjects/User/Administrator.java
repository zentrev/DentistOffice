package BusinessObjects.User;

import java.io.Serializable;

/**
 * Class thats is a child to UserImp
 */
public class Administrator extends UserImp {

    public Administrator(){}

    public Administrator(String userName, String password, String firstName, String lastName){
        super(userName, password,firstName,lastName);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    /**
     * Overrides the default equals
     * @param obj - obj
     * @return the same password
     */
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
}
