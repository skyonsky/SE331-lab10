package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by SKY on 4/19/2016.
 */

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail (String email);
    User findByUsername (String username);
    User findByEmailAndPassword (String email, String password);

}
