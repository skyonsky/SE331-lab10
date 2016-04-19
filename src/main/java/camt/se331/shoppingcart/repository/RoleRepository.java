package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Role;
import camt.se331.shoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SKY on 4/19/2016.
 */

public interface RoleRepository extends JpaRepository<Role,Long>{


}
