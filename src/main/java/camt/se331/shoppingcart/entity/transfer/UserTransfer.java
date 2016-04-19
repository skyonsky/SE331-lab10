package camt.se331.shoppingcart.entity.transfer;

import java.util.Map;

/**
 * Created by SKY on 4/19/2016.
 */
public class UserTransfer {

    public UserTransfer(String name, Map<String, Boolean> roles) {
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public Map<String, Boolean> getRoles() {
        return roles;
    }

    private final String name;

    private final Map<String, Boolean> roles;


}
