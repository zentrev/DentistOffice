package BusinessObjects.User;

public class Administrator extends UserImp {

    public Administrator(){}

    public Administrator(String userName, String password, String firstName, String lastName){
        super(userName, password,firstName,lastName);
    }
}