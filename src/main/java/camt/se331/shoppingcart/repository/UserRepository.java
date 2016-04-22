package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SKY on 4/20/2016.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String Email);
    User findByUsername(String username);
    User findByEmailAndPassword(String email, String password);
}
