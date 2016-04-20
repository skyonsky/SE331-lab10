package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.User;

import java.util.List;

/**
 * Created by SKY on 4/20/2016.
 */
public interface UserService {
    public List<User> findAll();
    public User findByUserName(String username);
}
