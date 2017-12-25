package net.oneread.redditbros;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sermilion on 12/24/17.
 */

public class Backend {

    private Map<String, String> registredUsers;

    public Backend() {
        registredUsers = new HashMap<>();
        registredUsers.put("orvyn", "password1");
        registredUsers.put("sermilion", "password2");
    }

    public boolean login(String username, String password) {
        if (registredUsers.containsKey(username)) {
            if (registredUsers.get(username).equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean register(String username, String password) {
        if (!registredUsers.containsKey(username)) {
            registredUsers.put(username, password);
            return true;
        }
        return false;
    }

}
