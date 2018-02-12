package BusinessObjects.User;

import java.io.Serializable;
import java.util.*;

/**
 * Class that adds a list
 */
public class UserList extends ArrayList<User> implements Serializable{

    /**
     * sorts userList by userName
     */
    public void sortUsers(){
        Collections.sort(this, new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return o1.getUserName().compareTo(o2.getUserName());
            }
        });
    }

    public Map<Integer, User> getUserMap(){
        sortUsers();
        Map<Integer,User> map = new HashMap<>();
        for(int i = 0; i<this.size(); i++){
            map.put(i, this.get(i));
        }
        return map;
    }

}
