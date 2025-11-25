package homework.medicalCentre.storage;

import homework.medicalCentre.model.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStorage implements Serializable {

    private List<User> users = new ArrayList<>();
    private Map<String,String> userMap = new HashMap<>();

    public void createUser(User user) {
        users.add(user);
        userMap.put(user.getEmail(),user.getPassword());
    }


    public Boolean checkUser(String email, String password) {
        if (userMap.containsKey(email) && userMap.get(email).contains(password)){
            return true;
        }
        return null;
    }


    public String foundeName(String email) {
        for (User user : users) {
            if(user.getEmail().contains(email)){
                return user.getName();
            }
        }
        return "Not found";
    }
}
