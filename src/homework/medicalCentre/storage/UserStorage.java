package homework.medicalCentre.storage;

import homework.medicalCentre.model.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

     private Map<String, User> userMap = new HashMap<>();

    public void register(User user) {
        userMap.put(user.getEmail(), user);
    }


public  User getUserByEmail(String email){
        return  userMap.get(email);
}

    public void printAllUsers() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public void removeUserByEmail(String userEmail) {
        userMap.remove(userEmail);
    }
}
