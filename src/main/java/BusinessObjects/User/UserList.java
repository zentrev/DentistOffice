package BusinessObjects.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class that adds a list
 */
public class UserList extends ArrayList<UserImp> implements Serializable{

    /**
     * sorts userList by userName
     */
    public void sortUsers(){
        Collections.sort(this, new Comparator<UserImp>(){
            @Override
            public int compare(UserImp o1, UserImp o2) {
                return o1.getUserName().compareTo(o2.getUserName());
            }
        });
    }

}
