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
}
